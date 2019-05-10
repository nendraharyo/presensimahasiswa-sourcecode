package android.support.v7.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.support.v7.appcompat.R.style;
import android.view.LayoutInflater;

public class ContextThemeWrapper
  extends ContextWrapper
{
  private LayoutInflater mInflater;
  private Configuration mOverrideConfiguration;
  private Resources mResources;
  private Resources.Theme mTheme;
  private int mThemeResource;
  
  public ContextThemeWrapper()
  {
    super(null);
  }
  
  public ContextThemeWrapper(Context paramContext, int paramInt)
  {
    super(paramContext);
    this.mThemeResource = paramInt;
  }
  
  public ContextThemeWrapper(Context paramContext, Resources.Theme paramTheme)
  {
    super(paramContext);
    this.mTheme = paramTheme;
  }
  
  private Resources getResourcesInternal()
  {
    Object localObject = this.mResources;
    if (localObject == null)
    {
      localObject = this.mOverrideConfiguration;
      if (localObject != null) {
        break label33;
      }
      localObject = super.getResources();
      this.mResources = ((Resources)localObject);
    }
    for (;;)
    {
      return this.mResources;
      label33:
      int i = Build.VERSION.SDK_INT;
      int j = 17;
      if (i >= j)
      {
        localObject = this.mOverrideConfiguration;
        localObject = createConfigurationContext((Configuration)localObject).getResources();
        this.mResources = ((Resources)localObject);
      }
    }
  }
  
  private void initializeTheme()
  {
    Resources.Theme localTheme1 = this.mTheme;
    boolean bool;
    if (localTheme1 == null) {
      bool = true;
    }
    for (;;)
    {
      if (bool)
      {
        localTheme2 = getResources().newTheme();
        this.mTheme = localTheme2;
        localTheme2 = getBaseContext().getTheme();
        if (localTheme2 != null)
        {
          Resources.Theme localTheme3 = this.mTheme;
          localTheme3.setTo(localTheme2);
        }
      }
      Resources.Theme localTheme2 = this.mTheme;
      int i = this.mThemeResource;
      onApplyThemeResource(localTheme2, i, bool);
      return;
      bool = false;
      localTheme1 = null;
    }
  }
  
  public void applyOverrideConfiguration(Configuration paramConfiguration)
  {
    Object localObject = this.mResources;
    if (localObject != null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("getResources() or getAssets() has already been called");
      throw ((Throwable)localObject);
    }
    localObject = this.mOverrideConfiguration;
    if (localObject != null)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Override configuration has already been set");
      throw ((Throwable)localObject);
    }
    localObject = new android/content/res/Configuration;
    ((Configuration)localObject).<init>(paramConfiguration);
    this.mOverrideConfiguration = ((Configuration)localObject);
  }
  
  protected void attachBaseContext(Context paramContext)
  {
    super.attachBaseContext(paramContext);
  }
  
  public AssetManager getAssets()
  {
    return getResources().getAssets();
  }
  
  public Resources getResources()
  {
    return getResourcesInternal();
  }
  
  public Object getSystemService(String paramString)
  {
    Object localObject = "layout_inflater";
    boolean bool = ((String)localObject).equals(paramString);
    if (bool)
    {
      localObject = this.mInflater;
      if (localObject == null)
      {
        localObject = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        this.mInflater = ((LayoutInflater)localObject);
      }
    }
    for (localObject = this.mInflater;; localObject = getBaseContext().getSystemService(paramString)) {
      return localObject;
    }
  }
  
  public Resources.Theme getTheme()
  {
    Resources.Theme localTheme = this.mTheme;
    if (localTheme != null) {}
    for (localTheme = this.mTheme;; localTheme = this.mTheme)
    {
      return localTheme;
      int i = this.mThemeResource;
      if (i == 0)
      {
        i = R.style.Theme_AppCompat_Light;
        this.mThemeResource = i;
      }
      initializeTheme();
    }
  }
  
  public int getThemeResId()
  {
    return this.mThemeResource;
  }
  
  protected void onApplyThemeResource(Resources.Theme paramTheme, int paramInt, boolean paramBoolean)
  {
    paramTheme.applyStyle(paramInt, true);
  }
  
  public void setTheme(int paramInt)
  {
    int i = this.mThemeResource;
    if (i != paramInt)
    {
      this.mThemeResource = paramInt;
      initializeTheme();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\ContextThemeWrapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */