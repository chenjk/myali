package com.alipay.android.mini.window;

import com.alipay.android.app.exception.AppErrorException;
import com.alipay.android.app.monitor.MonitorThread;
import com.alipay.android.app.util.LogUtils;

final class y
  implements Runnable
{
  y(MiniWindowManager paramMiniWindowManager, IUIForm paramIUIForm, int paramInt)
  {
  }

  public final void run()
  {
    try
    {
      MiniWindowManager.getBundle(this.c).v(this.a, this.b);
      return;
    }
    catch (AppErrorException localAppErrorException)
    {
      MonitorThread.a().b(localAppErrorException, "main thread crash");
      LogUtils.a(localAppErrorException);
    }
  }
}

/* Location:           /Users/don/DeSources/alipay/backup/zhifubaoqianbao_52/classes-dex2jar.jar
 * Qualified Name:     com.alipay.android.mini.window.y
 * JD-Core Version:    0.6.2
 */