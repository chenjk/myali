package com.alipay.android.app.display.uielement;

import com.alipay.android.app.display.event.EventType;
import com.alipay.android.app.display.event.MspEventArgs;
import com.alipay.android.app.event.IEventArgs.EventScript;
import com.alipay.android.lib.plusin.script.EventScriptOperation;
import com.alipay.android.lib.plusin.script.EventScriptType;

final class bl extends MspEventArgs
{
  bl(bk parambk, EventType paramEventType)
  {
    super(paramEventType);
  }

  public final IEventArgs.EventScript getEventScript(EventScriptType paramEventScriptType)
  {
    return new IEventArgs.EventScript(EventScriptOperation.a, this.a.a.getBundle(EventType.b));
  }
}

/* Location:           /Users/don/DeSources/alipay/backup/zhifubaoqianbao_52/classes-dex2jar.jar
 * Qualified Name:     com.alipay.android.app.display.uielement.bl
 * JD-Core Version:    0.6.2
 */