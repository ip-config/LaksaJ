package com.firestack.example;

import com.firestack.laksaj.account.Wallet;
import com.firestack.laksaj.jsonrpc.HttpProvider;
import com.firestack.laksaj.transaction.Transaction;
import com.firestack.laksaj.transaction.TransactionFactory;

import java.io.IOException;

import static com.firestack.laksaj.account.Wallet.pack;

public class Main {
    public static void main(String[] args) throws IOException {
        Wallet wallet = new Wallet();
        String ptivateKey = "e19d05c5452598e24caad4a0d85a49146f7be089515c905ae6a19e8a578a6930";
        // Populate the wallet with an account
        String address = wallet.addByPrivateKey(ptivateKey);
        System.out.println("address is: " + address);

        HttpProvider provider = new HttpProvider("https://api.zilliqa.com");
        //get balance
        HttpProvider.BalanceResult balanceResult = provider.getBalance(address);
        System.out.println("balance is: " + balanceResult.getBalance());

        //construct non-contract transaction
        Transaction transaction = Transaction.builder()
                .version(String.valueOf(pack(2, 8)))
                .toAddr("4baf5fada8e5db92c3d3242618c5b47133ae003c".toLowerCase())
                .senderPubKey("0246e7178dc8253201101e18fd6f6eb9972451d121fc57aa2a06dd5c111e58dc6a")
                .amount("10000000")
                .gasPrice("1000000000")
                .gasLimit("1")
                .code("")
                .data("")
                .provider(new HttpProvider("https://api.zilliqa.com/"))
                .build();

        //sign transaction
        transaction = wallet.sign(transaction);
        System.out.println("signature is: " + transaction.getSignature());

        //send transaction
        HttpProvider.CreateTxResult result = TransactionFactory.sendTransaction(transaction);
        System.out.println(result);

    }
}