package com.alipay.android.widget.security.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

class SecurityDribbletActivity$8
  implements DialogInterface.OnCancelListener
{
  SecurityDribbletActivity$8(SecurityDribbletActivity paramSecurityDribbletActivity)
  {
  }

  public void onCancel(DialogInterface paramDialogInterface)
  {
    if ((SecurityDribbletActivity.removeBundle(this.a) != null) && (SecurityDribbletActivity.removeBundle(this.a).isAlive()))
      SecurityDribbletActivity.removeBundle(this.a).interrupt();
    paramDialogInterface.cancel();
    this.a.getBundle(Boolean.valueOf(true));
  }
}

/* Location:           /Users/don/DeSources/alipay/backup/zhifubaoqianbao_52/classes-dex2jar.jar
 * Qualified Name:     com.alipay.android.widget.security.ui.SecurityDribbletActivity.8
 * JD-Core Version:    0.6.2
 */