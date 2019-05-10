package io.fabric.sdk.android.services.network;

import java.io.InputStream;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

public final class NetworkUtils
{
  public static final SSLSocketFactory getSSLSocketFactory(PinningInfoProvider paramPinningInfoProvider)
  {
    SSLContext localSSLContext = SSLContext.getInstance("TLS");
    Object localObject1 = new io/fabric/sdk/android/services/network/SystemKeyStore;
    Object localObject2 = paramPinningInfoProvider.getKeyStoreStream();
    String str = paramPinningInfoProvider.getKeyStorePassword();
    ((SystemKeyStore)localObject1).<init>((InputStream)localObject2, str);
    localObject2 = new io/fabric/sdk/android/services/network/PinningTrustManager;
    ((PinningTrustManager)localObject2).<init>((SystemKeyStore)localObject1, paramPinningInfoProvider);
    localObject1 = new TrustManager[1];
    localObject1[0] = localObject2;
    localSSLContext.init(null, (TrustManager[])localObject1, null);
    return localSSLContext.getSocketFactory();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\network\NetworkUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */