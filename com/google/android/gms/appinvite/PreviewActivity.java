package com.google.android.gms.appinvite;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.webkit.WebView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TabWidget;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class PreviewActivity
  extends Activity
{
  public static final String ACTION_PREVIEW = "com.google.android.gms.appinvite.ACTION_PREVIEW";
  public static final String EXTRA_LAYOUT_RES_ID = "com.google.android.gms.appinvite.LAYOUT_RES_ID";
  public static final String EXTRA_TABS = "com.google.android.gms.appinvite.TABS";
  public static final String EXTRA_VIEWS = "com.google.android.gms.appinvite.VIEWS";
  public static final String KEY_TAB_CONTENT_ID = "tabContentId";
  public static final String KEY_TAB_TAG = "tabTag";
  public static final String KEY_TEXT_VIEW_IS_TITLE = "TextView_isTitle";
  public static final String KEY_TEXT_VIEW_TEXT = "TextView_text";
  public static final String KEY_TEXT_VIEW_TEXT_COLOR = "TextView_textColor";
  public static final String KEY_VIEW_BACKGROUND_COLOR = "View_backgroundColor";
  public static final String KEY_VIEW_ID = "View_id";
  public static final String KEY_VIEW_MIN_HEIGHT = "View_minHeight";
  public static final String KEY_VIEW_ON_CLICK_LISTENER = "View_onClickListener";
  public static final String KEY_WEB_VIEW_DATA = "WebView_data";
  public static final String ON_CLICK_LISTENER_CLOSE = "close";
  
  private View zza(Context paramContext, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    int i = paramBundle.getInt("com.google.android.gms.appinvite.LAYOUT_RES_ID");
    Object localObject1 = LayoutInflater.from(paramContext);
    Iterator localIterator = null;
    localObject1 = ((LayoutInflater)localObject1).inflate(i, paramViewGroup, false);
    Object localObject2 = paramBundle.getParcelableArrayList("com.google.android.gms.appinvite.VIEWS");
    if (localObject2 != null)
    {
      localIterator = ((ArrayList)localObject2).iterator();
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject2 = (Bundle)localIterator.next();
        zza((View)localObject1, (Bundle)localObject2);
      }
    }
    return (View)localObject1;
  }
  
  private void zza(View paramView, Bundle paramBundle)
  {
    int i = -1;
    int j = paramBundle.getInt("View_id");
    View localView = paramView.findViewById(j);
    Object localObject1 = paramBundle.keySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (String)localIterator.next();
      int n = ((String)localObject1).hashCode();
      switch (n)
      {
      default: 
        label136:
        n = i;
      }
      Object localObject2;
      for (;;)
      {
        switch (n)
        {
        default: 
          break;
        case 0: 
          k = paramBundle.getInt((String)localObject1);
          ((View)localView).setBackgroundColor(k);
          break;
          localObject2 = "View_backgroundColor";
          boolean bool4 = ((String)localObject1).equals(localObject2);
          if (!bool4) {
            break label136;
          }
          bool4 = false;
          localObject2 = null;
          continue;
          localObject2 = "View_minHeight";
          bool4 = ((String)localObject1).equals(localObject2);
          if (!bool4) {
            break label136;
          }
          bool4 = true;
          continue;
          localObject2 = "View_onClickListener";
          bool4 = ((String)localObject1).equals(localObject2);
          if (!bool4) {
            break label136;
          }
          int i1 = 2;
          continue;
          localObject2 = "TextView_text";
          boolean bool5 = ((String)localObject1).equals(localObject2);
          if (!bool5) {
            break label136;
          }
          int i2 = 3;
          continue;
          localObject2 = "TextView_textColor";
          boolean bool6 = ((String)localObject1).equals(localObject2);
          if (!bool6) {
            break label136;
          }
          int i3 = 4;
          continue;
          localObject2 = "TextView_isTitle";
          boolean bool7 = ((String)localObject1).equals(localObject2);
          if (!bool7) {
            break label136;
          }
          int i4 = 5;
          continue;
          localObject2 = "WebView_data";
          boolean bool8 = ((String)localObject1).equals(localObject2);
          if (!bool8) {
            break label136;
          }
          i5 = 6;
        }
      }
      int k = paramBundle.getInt((String)localObject1);
      ((View)localView).setMinimumHeight(k);
      continue;
      localObject1 = paramBundle.getString((String)localObject1);
      int i5 = ((String)localObject1).hashCode();
      switch (i5)
      {
      default: 
        label436:
        k = i;
      }
      for (;;)
      {
        switch (k)
        {
        default: 
          break;
        case 0: 
          localObject1 = new com/google/android/gms/appinvite/PreviewActivity$1;
          ((PreviewActivity.1)localObject1).<init>(this);
          ((View)localView).setOnClickListener((View.OnClickListener)localObject1);
          break;
          localObject2 = "close";
          boolean bool2 = ((String)localObject1).equals(localObject2);
          if (!bool2) {
            break label436;
          }
          bool2 = false;
          localObject1 = null;
        }
      }
      boolean bool9 = localView instanceof TextView;
      if (bool9)
      {
        localObject2 = localView;
        localObject2 = (TextView)localView;
        localObject1 = paramBundle.getCharSequence((String)localObject1);
        ((TextView)localObject2).setText((CharSequence)localObject1);
        continue;
        bool9 = localView instanceof TextView;
        if (bool9)
        {
          localObject2 = localView;
          localObject2 = (TextView)localView;
          int m = paramBundle.getInt((String)localObject1);
          ((TextView)localObject2).setTextColor(m);
          continue;
          bool9 = localView instanceof TextView;
          if (bool9)
          {
            boolean bool3 = paramBundle.getBoolean((String)localObject1);
            if (bool3)
            {
              localObject1 = localView;
              localObject1 = ((TextView)localView).getText();
              setTitle((CharSequence)localObject1);
              continue;
              bool9 = localView instanceof ViewGroup;
              if (bool9)
              {
                localObject2 = new android/webkit/WebView;
                ((WebView)localObject2).<init>(this);
                localObject1 = paramBundle.getString((String)localObject1);
                String str = "UTF-8";
                ((WebView)localObject2).loadData((String)localObject1, "text/html; charset=utf-8", str);
                localObject1 = localView;
                localObject1 = (ViewGroup)localView;
                ViewGroup.LayoutParams localLayoutParams = new android/view/ViewGroup$LayoutParams;
                localLayoutParams.<init>(i, i);
                ((ViewGroup)localObject1).addView((View)localObject2, localLayoutParams);
              }
            }
          }
        }
      }
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Object localObject1 = getCallingActivity();
    Object localObject2;
    boolean bool1;
    if (localObject1 != null)
    {
      localObject1 = "com.google.android.gms";
      localObject2 = getCallingActivity().getPackageName();
      bool1 = ((String)localObject1).equals(localObject2);
      if (bool1) {}
    }
    else
    {
      finish();
    }
    for (;;)
    {
      return;
      localObject1 = "com.google.android.gms";
      int j = 0;
      localObject2 = null;
      Context localContext;
      View localView;
      try
      {
        localContext = createPackageContext((String)localObject1, 0);
        localObject3 = getIntent().getExtras();
        bool1 = false;
        localObject1 = null;
        localView = zza(localContext, null, (Bundle)localObject3);
        if (localView != null) {
          break label103;
        }
        finish();
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        finish();
      }
      continue;
      label103:
      int i = 16908306;
      TabHost localTabHost = (TabHost)localView.findViewById(i);
      j = 16908307;
      localObject2 = (TabWidget)localView.findViewById(j);
      Object localObject4 = "com.google.android.gms.appinvite.TABS";
      Object localObject3 = ((Bundle)localObject3).getParcelableArrayList((String)localObject4);
      if ((localTabHost != null) && (localObject2 != null) && (localObject3 != null))
      {
        localTabHost.setup();
        localObject4 = ((ArrayList)localObject3).iterator();
        for (;;)
        {
          boolean bool2 = ((Iterator)localObject4).hasNext();
          if (!bool2) {
            break;
          }
          localObject3 = (Bundle)((Iterator)localObject4).next();
          Object localObject5 = ((Bundle)localObject3).getString("tabTag");
          localObject5 = localTabHost.newTabSpec((String)localObject5);
          String str = "tabContentId";
          int k = ((Bundle)localObject3).getInt(str);
          ((TabHost.TabSpec)localObject5).setContent(k);
          localObject3 = zza(localContext, (ViewGroup)localObject2, (Bundle)localObject3);
          ((TabHost.TabSpec)localObject5).setIndicator((View)localObject3);
          localTabHost.addTab((TabHost.TabSpec)localObject5);
        }
      }
      setContentView(localView);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\appinvite\PreviewActivity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */