# LaksaJ
LaksaJ -- Zilliqa Blockchain Java Library 

The project is still under development.

## Supports

### Account API

- [x] fromFile
- [x] toFile

### Wallet API

- [x] createAccount
- [x] addByPrivateKey addByKeyStore
- [x] remove
- [x] setDefault
- [x] signTransaction (default account)
- [x] signTransactionWith (specific account)

### TransactionFactory Transaction

- [x] sendTransaction
- [x] trackTx
- [x] confirm
- [x] isPending isInitialised isConfirmed isRejected

### ContractFactory Contract

- [x] deploy
- [x] call
- [x] isInitialised isDeployed isRejected
- [x] getState
- [x] getAddressForContract


### Crypto API

- [x] getDerivedKey (PBKDF2 and Scrypt)
- [x] generatePrivateKey
- [x] Schnorr.sign
- [x] Schnorr.verify
- [x] getPublicKeyFromPrivateKey
- [x] getPublicKeyFromPrivateKey
- [x] getAddressFromPublicKey
- [x] getAddressFromPrivateKey
- [x] encryptPrivateKey
- [x] decryptPrivateKey

### JSON-RPC API
- [x] getBalance
- [x] getDsBlock
- [x] getTxBlock
- [x] getLatestDsBlock
- [x] getLatestTxBlock
- [x] getTransaction
- [x] getSmartContracts
- [x] getSmartContractState
- [x] getSmartContractCode
- [x] getSmartContractInit
- [x] getBlockchainInfo
- [x] getNetworkId
- [x] getRecentTransactions
- [x] getDSBlockListing 
- [x] getTxBlockListing 
- [x] getMinimumGasPrice

### Validation

- [x] isAddress
- [x] isPublicjKey
- [x] isPrivateKey
- [x] isSignature

### Util

- [x] byteArrayToHexString
- [x] hexStringToByteArray
- [x] generateMac
- [x] isByteString
- [x] encodeTransactionProto
- [x] toChecksumAddress
- [x] isValidChecksumAddress

## Build 


you can build jar using following command :

```
gradle build -x test
```

we will publish our sdk to https://mvnrepository.com




