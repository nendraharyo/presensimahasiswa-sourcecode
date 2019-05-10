package com.crashlytics.android.core;

import org.json.JSONObject;

final class MetaDataStore$1
  extends JSONObject
{
  MetaDataStore$1(UserMetaData paramUserMetaData)
  {
    String str = this.val$userData.id;
    put("userId", str);
    str = this.val$userData.name;
    put("userName", str);
    str = this.val$userData.email;
    put("userEmail", str);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\crashlytics\android\core\MetaDataStore$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */