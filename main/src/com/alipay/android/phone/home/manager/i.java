package com.alipay.android.phone.home.manager;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.alipay.mobile.common.logging.LogCatLog;
import com.alipay.mobile.framework.MicroApplicationContext;
import com.alipay.mobile.framework.app.AppLoadException;
import com.alipay.mobile.framework.service.ext.openplatform.app.App;

final class i
  implements DialogInterface.OnClickListener
{
  i(HomeAppsOnItemClickListener paramHomeAppsOnItemClickListener, App paramApp)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    try
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("TARGET", "DETAIL");
      localBundle.putString("APP_ID", this.a.getAppId());
      localBundle.putString("ACTION", "UPGRADE");
      HomeAppsOnItemClickListener.getBundle(this.b).startApp("20000002", "10000111", localBundle);
      return;
    }
    catch (AppLoadException localAppLoadException)
    {
      LogCatLog.e("AppCenterOnItemClickListener", localAppLoadException.getLocalizedMessage());
    }
  }
}

/* Location:           /Users/don/DeSources/alipay/backup/zhifubaoqianbao_52/classes-dex2jar.jar
 * Qualified Name:     com.alipay.android.phone.home.manager.i
 * JD-Core Version:    0.6.2
 */