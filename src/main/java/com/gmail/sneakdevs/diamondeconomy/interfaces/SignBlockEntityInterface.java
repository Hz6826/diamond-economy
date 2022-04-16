package com.gmail.sneakdevs.diamondeconomy.interfaces;

public interface SignBlockEntityInterface {
    void diamondeconomy_setOwner(String newOwner);
    void diamondeconomy_setShop(boolean newShop);
    void diamondeconomy_setAdminShop(boolean newAdminShop);
    String diamondeconomy_getOwner();
    boolean diamondeconomy_getAdminShop();
    boolean diamondeconomy_getShop();
}