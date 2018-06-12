package com.kh69coin.wallet.ui;

import android.support.v4.app.Fragment;

import com.kh69coin.core.wallet.WalletAccount;

/**
 * @author John L. Jegutanis
 */
public abstract class WalletFragment extends Fragment implements ViewUpdateble {
    abstract public WalletAccount getAccount();
}
