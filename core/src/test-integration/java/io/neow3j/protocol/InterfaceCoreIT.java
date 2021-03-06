package io.neow3j.protocol;

public interface InterfaceCoreIT {

    void testGetVersion() throws Exception;

    void testGetBestBlockHash() throws Exception;

    void testGetBlockHash() throws Exception;

    void testGetConnectionCount() throws Exception;

    void testListAddress() throws Exception;

    void testGetPeers() throws Exception;

    void testGetRawMemPool() throws Exception;

    void testGetValidators() throws Exception;

    void testValidateAddress() throws Exception;

    void testGetBlock_Index_fullTransactionObjects() throws Exception;

    void testGetBlock_Index() throws Exception;

    void testGetBlock_Hash_fullTransactionObjects() throws Exception;

    void testGetBlock_Hash() throws Exception;

    void testGetRawBlock_Index() throws Exception;

    void testGetRawBlock_Hash() throws Exception;

    void testGetBlockCount() throws Exception;

    void testGetAccountState() throws Exception;

    void testGetBlockHeader_Hash() throws Exception;

    void testGetBlockHeader_Index() throws Exception;

    void testGetRawBlockHeader_Hash() throws Exception;

    void testGetRawBlockHeader_Index() throws Exception;

    void testGetNewAddress() throws Exception;

    void testGetWalletHeight() throws Exception;

    void testGetBlockSysFee() throws Exception;

    void testGetTxOut() throws Exception;

    void testSendRawTransaction() throws Exception;

    void testSendToAddress() throws Exception;

    void testSendToAddress_Fee() throws Exception;

    void testSendToAddress_Fee_And_ChangeAddress() throws Exception;

    void testGetTransaction() throws Exception;

    void testGetRawTransaction() throws Exception;

    void testGetBalance() throws Exception;

    void testGetAssetState() throws Exception;

    void testSendMany() throws Exception;

    void testSendMany_Empty_Transaction() throws Exception;

    void testSendMany_Fee() throws Exception;

    void testSendMany_Fee_And_ChangeAddress() throws Exception;

    void testDumpPrivKey() throws Exception;

}
