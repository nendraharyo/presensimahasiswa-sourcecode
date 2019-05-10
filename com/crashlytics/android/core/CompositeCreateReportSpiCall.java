package com.crashlytics.android.core;

class CompositeCreateReportSpiCall
  implements CreateReportSpiCall
{
  private final DefaultCreateReportSpiCall javaReportSpiCall;
  private final NativeCreateReportSpiCall nativeReportSpiCall;
  
  public CompositeCreateReportSpiCall(DefaultCreateReportSpiCall paramDefaultCreateReportSpiCall, NativeCreateReportSpiCall paramNativeCreateReportSpiCall)
  {
    this.javaReportSpiCall = paramDefaultCreateReportSpiCall;
    this.nativeReportSpiCall = paramNativeCreateReportSpiCall;
  }
  
  public boolean invoke(CreateReportRequest paramCreateReportRequest)
  {
    boolean bool = true;
    Object localObject = CompositeCreateReportSpiCall.1.$SwitchMap$com$crashlytics$android$core$Report$Type;
    Report.Type localType = paramCreateReportRequest.report.getType();
    int i = localType.ordinal();
    int j = localObject[i];
    switch (j)
    {
    default: 
      bool = false;
    }
    for (;;)
    {
      return bool;
      localObject = this.javaReportSpiCall;
      ((DefaultCreateReportSpiCall)localObject).invoke(paramCreateReportRequest);
      continue;
      localObject = this.nativeReportSpiCall;
      ((NativeCreateReportSpiCall)localObject).invoke(paramCreateReportRequest);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\CompositeCreateReportSpiCall.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */