package org.apache.http.entity;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Locale;
import org.apache.http.Consts;
import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.message.BasicHeaderValueFormatter;
import org.apache.http.message.BasicHeaderValueParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.util.Args;
import org.apache.http.util.CharArrayBuffer;
import org.apache.http.util.TextUtils;

public final class ContentType
  implements Serializable
{
  public static final ContentType APPLICATION_ATOM_XML;
  public static final ContentType APPLICATION_FORM_URLENCODED;
  public static final ContentType APPLICATION_JSON;
  public static final ContentType APPLICATION_OCTET_STREAM;
  public static final ContentType APPLICATION_SVG_XML;
  public static final ContentType APPLICATION_XHTML_XML;
  public static final ContentType APPLICATION_XML;
  public static final ContentType DEFAULT_BINARY = APPLICATION_OCTET_STREAM;
  public static final ContentType DEFAULT_TEXT;
  public static final ContentType MULTIPART_FORM_DATA;
  public static final ContentType TEXT_HTML;
  public static final ContentType TEXT_PLAIN;
  public static final ContentType TEXT_XML;
  public static final ContentType WILDCARD;
  private static final long serialVersionUID = -7768694718232371896L;
  private final Charset charset;
  private final String mimeType;
  private final NameValuePair[] params;
  
  static
  {
    Charset localCharset = Consts.ISO_8859_1;
    APPLICATION_ATOM_XML = create("application/atom+xml", localCharset);
    localCharset = Consts.ISO_8859_1;
    APPLICATION_FORM_URLENCODED = create("application/x-www-form-urlencoded", localCharset);
    localCharset = Consts.UTF_8;
    APPLICATION_JSON = create("application/json", localCharset);
    ((Charset)null);
    APPLICATION_OCTET_STREAM = create("application/octet-stream", null);
    localCharset = Consts.ISO_8859_1;
    APPLICATION_SVG_XML = create("application/svg+xml", localCharset);
    localCharset = Consts.ISO_8859_1;
    APPLICATION_XHTML_XML = create("application/xhtml+xml", localCharset);
    localCharset = Consts.ISO_8859_1;
    APPLICATION_XML = create("application/xml", localCharset);
    localCharset = Consts.ISO_8859_1;
    MULTIPART_FORM_DATA = create("multipart/form-data", localCharset);
    localCharset = Consts.ISO_8859_1;
    TEXT_HTML = create("text/html", localCharset);
    localCharset = Consts.ISO_8859_1;
    TEXT_PLAIN = create("text/plain", localCharset);
    localCharset = Consts.ISO_8859_1;
    TEXT_XML = create("text/xml", localCharset);
    ((Charset)null);
    WILDCARD = create("*/*", null);
    DEFAULT_TEXT = TEXT_PLAIN;
  }
  
  ContentType(String paramString, Charset paramCharset)
  {
    this.mimeType = paramString;
    this.charset = paramCharset;
    this.params = null;
  }
  
  ContentType(String paramString, NameValuePair[] paramArrayOfNameValuePair)
  {
    this.mimeType = paramString;
    this.params = paramArrayOfNameValuePair;
    Object localObject = getParameter("charset");
    boolean bool = TextUtils.isBlank((CharSequence)localObject);
    if (!bool) {}
    for (localObject = Charset.forName((String)localObject);; localObject = null)
    {
      this.charset = ((Charset)localObject);
      return;
    }
  }
  
  public static ContentType create(String paramString)
  {
    ContentType localContentType = new org/apache/http/entity/ContentType;
    ((Charset)null);
    localContentType.<init>(paramString, null);
    return localContentType;
  }
  
  public static ContentType create(String paramString1, String paramString2)
  {
    boolean bool = TextUtils.isBlank(paramString2);
    if (!bool) {}
    for (Charset localCharset = Charset.forName(paramString2);; localCharset = null)
    {
      return create(paramString1, localCharset);
      bool = false;
    }
  }
  
  public static ContentType create(String paramString, Charset paramCharset)
  {
    String str = (String)Args.notBlank(paramString, "MIME type");
    Object localObject = Locale.ENGLISH;
    str = str.toLowerCase((Locale)localObject);
    Args.check(valid(str), "MIME type may not contain reserved characters");
    localObject = new org/apache/http/entity/ContentType;
    ((ContentType)localObject).<init>(str, paramCharset);
    return (ContentType)localObject;
  }
  
  private static ContentType create(HeaderElement paramHeaderElement)
  {
    String str = paramHeaderElement.getName();
    NameValuePair[] arrayOfNameValuePair = paramHeaderElement.getParameters();
    ContentType localContentType = new org/apache/http/entity/ContentType;
    if (arrayOfNameValuePair != null)
    {
      int i = arrayOfNameValuePair.length;
      if (i <= 0) {}
    }
    for (;;)
    {
      localContentType.<init>(str, arrayOfNameValuePair);
      return localContentType;
      arrayOfNameValuePair = null;
    }
  }
  
  public static ContentType get(HttpEntity paramHttpEntity)
  {
    ContentType localContentType = null;
    if (paramHttpEntity == null) {}
    for (;;)
    {
      return localContentType;
      Object localObject = paramHttpEntity.getContentType();
      if (localObject != null)
      {
        localObject = ((Header)localObject).getElements();
        int i = localObject.length;
        if (i > 0) {
          localContentType = create(localObject[0]);
        }
      }
    }
  }
  
  public static ContentType getOrDefault(HttpEntity paramHttpEntity)
  {
    ContentType localContentType = get(paramHttpEntity);
    if (localContentType != null) {}
    for (;;)
    {
      return localContentType;
      localContentType = DEFAULT_TEXT;
    }
  }
  
  public static ContentType parse(String paramString)
  {
    Args.notNull(paramString, "Content type");
    Object localObject1 = new org/apache/http/util/CharArrayBuffer;
    int i = paramString.length();
    ((CharArrayBuffer)localObject1).<init>(i);
    ((CharArrayBuffer)localObject1).append(paramString);
    Object localObject2 = new org/apache/http/message/ParserCursor;
    int j = paramString.length();
    ((ParserCursor)localObject2).<init>(0, j);
    BasicHeaderValueParser localBasicHeaderValueParser = BasicHeaderValueParser.INSTANCE;
    localObject1 = localBasicHeaderValueParser.parseElements((CharArrayBuffer)localObject1, (ParserCursor)localObject2);
    i = localObject1.length;
    if (i > 0) {
      return create(localObject1[0]);
    }
    localObject1 = new org/apache/http/ParseException;
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject2 = "Invalid content type: " + paramString;
    ((ParseException)localObject1).<init>((String)localObject2);
    throw ((Throwable)localObject1);
  }
  
  private static boolean valid(String paramString)
  {
    boolean bool = false;
    int i = 0;
    int j = paramString.length();
    if (i < j)
    {
      j = paramString.charAt(i);
      int k = 34;
      if (j != k)
      {
        k = 44;
        if (j != k)
        {
          k = 59;
          if (j != k) {
            break label52;
          }
        }
      }
    }
    for (;;)
    {
      return bool;
      label52:
      i += 1;
      break;
      bool = true;
    }
  }
  
  public Charset getCharset()
  {
    return this.charset;
  }
  
  public String getMimeType()
  {
    return this.mimeType;
  }
  
  public String getParameter(String paramString)
  {
    String str1 = null;
    Args.notEmpty(paramString, "Parameter name");
    NameValuePair[] arrayOfNameValuePair1 = this.params;
    if (arrayOfNameValuePair1 == null) {}
    label90:
    for (;;)
    {
      return str1;
      NameValuePair[] arrayOfNameValuePair2 = this.params;
      int i = arrayOfNameValuePair2.length;
      int j = 0;
      arrayOfNameValuePair1 = null;
      for (;;)
      {
        if (j >= i) {
          break label90;
        }
        NameValuePair localNameValuePair = arrayOfNameValuePair2[j];
        String str2 = localNameValuePair.getName();
        boolean bool = str2.equalsIgnoreCase(paramString);
        if (bool)
        {
          str1 = localNameValuePair.getValue();
          break;
        }
        j += 1;
      }
    }
  }
  
  public String toString()
  {
    CharArrayBuffer localCharArrayBuffer = new org/apache/http/util/CharArrayBuffer;
    int i = 64;
    localCharArrayBuffer.<init>(i);
    Object localObject = this.mimeType;
    localCharArrayBuffer.append((String)localObject);
    localObject = this.params;
    if (localObject != null)
    {
      localCharArrayBuffer.append("; ");
      localObject = BasicHeaderValueFormatter.INSTANCE;
      NameValuePair[] arrayOfNameValuePair = this.params;
      ((BasicHeaderValueFormatter)localObject).formatParameters(localCharArrayBuffer, arrayOfNameValuePair, false);
    }
    for (;;)
    {
      return localCharArrayBuffer.toString();
      localObject = this.charset;
      if (localObject != null)
      {
        localCharArrayBuffer.append("; charset=");
        localObject = this.charset.name();
        localCharArrayBuffer.append((String)localObject);
      }
    }
  }
  
  public ContentType withCharset(String paramString)
  {
    return create(getMimeType(), paramString);
  }
  
  public ContentType withCharset(Charset paramCharset)
  {
    return create(getMimeType(), paramCharset);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\org\apache\http\entity\ContentType.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */