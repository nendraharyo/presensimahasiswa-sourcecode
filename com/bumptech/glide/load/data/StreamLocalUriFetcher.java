package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract.Contacts;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class StreamLocalUriFetcher
  extends LocalUriFetcher
{
  private static final int ID_CONTACTS_CONTACT = 3;
  private static final int ID_CONTACTS_LOOKUP = 1;
  private static final int ID_CONTACTS_PHOTO = 4;
  private static final int ID_CONTACTS_THUMBNAIL = 2;
  private static final int ID_LOOKUP_BY_PHONE = 5;
  private static final UriMatcher URI_MATCHER;
  
  static
  {
    int i = 1;
    UriMatcher localUriMatcher = new android/content/UriMatcher;
    localUriMatcher.<init>(-1);
    URI_MATCHER = localUriMatcher;
    URI_MATCHER.addURI("com.android.contacts", "contacts/lookup/*/#", i);
    URI_MATCHER.addURI("com.android.contacts", "contacts/lookup/*", i);
    URI_MATCHER.addURI("com.android.contacts", "contacts/#/photo", 2);
    URI_MATCHER.addURI("com.android.contacts", "contacts/#", 3);
    URI_MATCHER.addURI("com.android.contacts", "contacts/#/display_photo", 4);
    URI_MATCHER.addURI("com.android.contacts", "phone_lookup/*", 5);
  }
  
  public StreamLocalUriFetcher(ContentResolver paramContentResolver, Uri paramUri)
  {
    super(paramContentResolver, paramUri);
  }
  
  private InputStream loadResourceFromUri(Uri paramUri, ContentResolver paramContentResolver)
  {
    Object localObject = URI_MATCHER;
    int i = ((UriMatcher)localObject).match(paramUri);
    switch (i)
    {
    default: 
      localObject = paramContentResolver.openInputStream(paramUri);
    }
    for (;;)
    {
      return (InputStream)localObject;
      localObject = openContactPhotoInputStream(paramContentResolver, paramUri);
      continue;
      localObject = ContactsContract.Contacts.lookupContact(paramContentResolver, paramUri);
      if (localObject == null)
      {
        localObject = new java/io/FileNotFoundException;
        ((FileNotFoundException)localObject).<init>("Contact cannot be found");
        throw ((Throwable)localObject);
      }
      localObject = openContactPhotoInputStream(paramContentResolver, (Uri)localObject);
    }
  }
  
  private InputStream openContactPhotoInputStream(ContentResolver paramContentResolver, Uri paramUri)
  {
    return ContactsContract.Contacts.openContactPhotoInputStream(paramContentResolver, paramUri, true);
  }
  
  protected void close(InputStream paramInputStream)
  {
    paramInputStream.close();
  }
  
  public Class getDataClass()
  {
    return InputStream.class;
  }
  
  protected InputStream loadResource(Uri paramUri, ContentResolver paramContentResolver)
  {
    Object localObject1 = loadResourceFromUri(paramUri, paramContentResolver);
    if (localObject1 == null)
    {
      localObject1 = new java/io/FileNotFoundException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "InputStream is null for " + paramUri;
      ((FileNotFoundException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    return (InputStream)localObject1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\data\StreamLocalUriFetcher.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */