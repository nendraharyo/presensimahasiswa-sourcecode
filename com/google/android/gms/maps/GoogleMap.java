package com.google.android.gms.maps;

import android.graphics.Bitmap;
import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.maps.internal.IGoogleMapDelegate;
import com.google.android.gms.maps.internal.ILocationSourceDelegate;
import com.google.android.gms.maps.internal.IProjectionDelegate;
import com.google.android.gms.maps.internal.IUiSettingsDelegate;
import com.google.android.gms.maps.internal.zzf;
import com.google.android.gms.maps.internal.zzh;
import com.google.android.gms.maps.internal.zzi;
import com.google.android.gms.maps.internal.zzj;
import com.google.android.gms.maps.internal.zzl;
import com.google.android.gms.maps.internal.zzm;
import com.google.android.gms.maps.internal.zzn;
import com.google.android.gms.maps.internal.zzp;
import com.google.android.gms.maps.internal.zzq;
import com.google.android.gms.maps.internal.zzr;
import com.google.android.gms.maps.internal.zzs;
import com.google.android.gms.maps.internal.zzu;
import com.google.android.gms.maps.internal.zzv;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.internal.IPolylineDelegate;
import com.google.android.gms.maps.model.internal.zzb;

public final class GoogleMap
{
  public static final int MAP_TYPE_HYBRID = 4;
  public static final int MAP_TYPE_NONE = 0;
  public static final int MAP_TYPE_NORMAL = 1;
  public static final int MAP_TYPE_SATELLITE = 2;
  public static final int MAP_TYPE_TERRAIN = 3;
  private final IGoogleMapDelegate zzaRr;
  private UiSettings zzaRs;
  
  protected GoogleMap(IGoogleMapDelegate paramIGoogleMapDelegate)
  {
    IGoogleMapDelegate localIGoogleMapDelegate = (IGoogleMapDelegate)zzx.zzz(paramIGoogleMapDelegate);
    this.zzaRr = localIGoogleMapDelegate;
  }
  
  public final Circle addCircle(CircleOptions paramCircleOptions)
  {
    try
    {
      Circle localCircle = new com/google/android/gms/maps/model/Circle;
      localObject = this.zzaRr;
      localObject = ((IGoogleMapDelegate)localObject).addCircle(paramCircleOptions);
      localCircle.<init>((zzb)localObject);
      return localCircle;
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
      ((RuntimeRemoteException)localObject).<init>(localRemoteException);
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public final com.google.android.gms.maps.model.GroundOverlay addGroundOverlay(com.google.android.gms.maps.model.GroundOverlayOptions paramGroundOverlayOptions)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 34	com/google/android/gms/maps/GoogleMap:zzaRr	Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //   4: astore_2
    //   5: aload_2
    //   6: aload_1
    //   7: invokeinterface 54 2 0
    //   12: astore_3
    //   13: aload_3
    //   14: ifnull +14 -> 28
    //   17: new 56	com/google/android/gms/maps/model/GroundOverlay
    //   20: astore_2
    //   21: aload_2
    //   22: aload_3
    //   23: invokespecial 59	com/google/android/gms/maps/model/GroundOverlay:<init>	(Lcom/google/android/gms/maps/model/internal/zzc;)V
    //   26: aload_2
    //   27: areturn
    //   28: aconst_null
    //   29: astore_2
    //   30: goto -4 -> 26
    //   33: astore_2
    //   34: new 45	com/google/android/gms/maps/model/RuntimeRemoteException
    //   37: astore_3
    //   38: aload_3
    //   39: aload_2
    //   40: invokespecial 48	com/google/android/gms/maps/model/RuntimeRemoteException:<init>	(Landroid/os/RemoteException;)V
    //   43: aload_3
    //   44: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	45	0	this	GoogleMap
    //   0	45	1	paramGroundOverlayOptions	com.google.android.gms.maps.model.GroundOverlayOptions
    //   4	26	2	localObject1	Object
    //   33	7	2	localRemoteException	RemoteException
    //   12	32	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   0	4	33	android/os/RemoteException
    //   6	12	33	android/os/RemoteException
    //   17	20	33	android/os/RemoteException
    //   22	26	33	android/os/RemoteException
  }
  
  /* Error */
  public final com.google.android.gms.maps.model.Marker addMarker(com.google.android.gms.maps.model.MarkerOptions paramMarkerOptions)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 34	com/google/android/gms/maps/GoogleMap:zzaRr	Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //   4: astore_2
    //   5: aload_2
    //   6: aload_1
    //   7: invokeinterface 63 2 0
    //   12: astore_3
    //   13: aload_3
    //   14: ifnull +14 -> 28
    //   17: new 65	com/google/android/gms/maps/model/Marker
    //   20: astore_2
    //   21: aload_2
    //   22: aload_3
    //   23: invokespecial 68	com/google/android/gms/maps/model/Marker:<init>	(Lcom/google/android/gms/maps/model/internal/zzf;)V
    //   26: aload_2
    //   27: areturn
    //   28: aconst_null
    //   29: astore_2
    //   30: goto -4 -> 26
    //   33: astore_2
    //   34: new 45	com/google/android/gms/maps/model/RuntimeRemoteException
    //   37: astore_3
    //   38: aload_3
    //   39: aload_2
    //   40: invokespecial 48	com/google/android/gms/maps/model/RuntimeRemoteException:<init>	(Landroid/os/RemoteException;)V
    //   43: aload_3
    //   44: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	45	0	this	GoogleMap
    //   0	45	1	paramMarkerOptions	com.google.android.gms.maps.model.MarkerOptions
    //   4	26	2	localObject1	Object
    //   33	7	2	localRemoteException	RemoteException
    //   12	32	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   0	4	33	android/os/RemoteException
    //   6	12	33	android/os/RemoteException
    //   17	20	33	android/os/RemoteException
    //   22	26	33	android/os/RemoteException
  }
  
  public final Polygon addPolygon(PolygonOptions paramPolygonOptions)
  {
    try
    {
      Polygon localPolygon = new com/google/android/gms/maps/model/Polygon;
      localObject = this.zzaRr;
      localObject = ((IGoogleMapDelegate)localObject).addPolygon(paramPolygonOptions);
      localPolygon.<init>((com.google.android.gms.maps.model.internal.zzg)localObject);
      return localPolygon;
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
      ((RuntimeRemoteException)localObject).<init>(localRemoteException);
      throw ((Throwable)localObject);
    }
  }
  
  public final Polyline addPolyline(PolylineOptions paramPolylineOptions)
  {
    try
    {
      Polyline localPolyline = new com/google/android/gms/maps/model/Polyline;
      localObject = this.zzaRr;
      localObject = ((IGoogleMapDelegate)localObject).addPolyline(paramPolylineOptions);
      localPolyline.<init>((IPolylineDelegate)localObject);
      return localPolyline;
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
      ((RuntimeRemoteException)localObject).<init>(localRemoteException);
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public final com.google.android.gms.maps.model.TileOverlay addTileOverlay(com.google.android.gms.maps.model.TileOverlayOptions paramTileOverlayOptions)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 34	com/google/android/gms/maps/GoogleMap:zzaRr	Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //   4: astore_2
    //   5: aload_2
    //   6: aload_1
    //   7: invokeinterface 90 2 0
    //   12: astore_3
    //   13: aload_3
    //   14: ifnull +14 -> 28
    //   17: new 92	com/google/android/gms/maps/model/TileOverlay
    //   20: astore_2
    //   21: aload_2
    //   22: aload_3
    //   23: invokespecial 95	com/google/android/gms/maps/model/TileOverlay:<init>	(Lcom/google/android/gms/maps/model/internal/zzh;)V
    //   26: aload_2
    //   27: areturn
    //   28: aconst_null
    //   29: astore_2
    //   30: goto -4 -> 26
    //   33: astore_2
    //   34: new 45	com/google/android/gms/maps/model/RuntimeRemoteException
    //   37: astore_3
    //   38: aload_3
    //   39: aload_2
    //   40: invokespecial 48	com/google/android/gms/maps/model/RuntimeRemoteException:<init>	(Landroid/os/RemoteException;)V
    //   43: aload_3
    //   44: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	45	0	this	GoogleMap
    //   0	45	1	paramTileOverlayOptions	com.google.android.gms.maps.model.TileOverlayOptions
    //   4	26	2	localObject1	Object
    //   33	7	2	localRemoteException	RemoteException
    //   12	32	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   0	4	33	android/os/RemoteException
    //   6	12	33	android/os/RemoteException
    //   17	20	33	android/os/RemoteException
    //   22	26	33	android/os/RemoteException
  }
  
  public final void animateCamera(CameraUpdate paramCameraUpdate)
  {
    try
    {
      IGoogleMapDelegate localIGoogleMapDelegate = this.zzaRr;
      localObject = paramCameraUpdate.zzzH();
      localIGoogleMapDelegate.animateCamera((com.google.android.gms.dynamic.zzd)localObject);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
      ((RuntimeRemoteException)localObject).<init>(localRemoteException);
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public final void animateCamera(CameraUpdate paramCameraUpdate, int paramInt, GoogleMap.CancelableCallback paramCancelableCallback)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 34	com/google/android/gms/maps/GoogleMap:zzaRr	Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //   4: astore 4
    //   6: aload_1
    //   7: invokevirtual 101	com/google/android/gms/maps/CameraUpdate:zzzH	()Lcom/google/android/gms/dynamic/zzd;
    //   10: astore 5
    //   12: aload_3
    //   13: ifnonnull +19 -> 32
    //   16: aconst_null
    //   17: astore 6
    //   19: aload 4
    //   21: aload 5
    //   23: iload_2
    //   24: aload 6
    //   26: invokeinterface 109 4 0
    //   31: return
    //   32: new 111	com/google/android/gms/maps/GoogleMap$zza
    //   35: astore 6
    //   37: aload 6
    //   39: aload_3
    //   40: invokespecial 114	com/google/android/gms/maps/GoogleMap$zza:<init>	(Lcom/google/android/gms/maps/GoogleMap$CancelableCallback;)V
    //   43: goto -24 -> 19
    //   46: astore 6
    //   48: new 45	com/google/android/gms/maps/model/RuntimeRemoteException
    //   51: astore 4
    //   53: aload 4
    //   55: aload 6
    //   57: invokespecial 48	com/google/android/gms/maps/model/RuntimeRemoteException:<init>	(Landroid/os/RemoteException;)V
    //   60: aload 4
    //   62: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	63	0	this	GoogleMap
    //   0	63	1	paramCameraUpdate	CameraUpdate
    //   0	63	2	paramInt	int
    //   0	63	3	paramCancelableCallback	GoogleMap.CancelableCallback
    //   4	57	4	localObject1	Object
    //   10	12	5	localzzd	com.google.android.gms.dynamic.zzd
    //   17	21	6	localObject2	Object
    //   46	10	6	localRemoteException	RemoteException
    // Exception table:
    //   from	to	target	type
    //   0	4	46	android/os/RemoteException
    //   6	10	46	android/os/RemoteException
    //   24	31	46	android/os/RemoteException
    //   32	35	46	android/os/RemoteException
    //   39	43	46	android/os/RemoteException
  }
  
  /* Error */
  public final void animateCamera(CameraUpdate paramCameraUpdate, GoogleMap.CancelableCallback paramCancelableCallback)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 34	com/google/android/gms/maps/GoogleMap:zzaRr	Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //   4: astore_3
    //   5: aload_1
    //   6: invokevirtual 101	com/google/android/gms/maps/CameraUpdate:zzzH	()Lcom/google/android/gms/dynamic/zzd;
    //   9: astore 4
    //   11: aload_2
    //   12: ifnonnull +17 -> 29
    //   15: aconst_null
    //   16: astore 5
    //   18: aload_3
    //   19: aload 4
    //   21: aload 5
    //   23: invokeinterface 118 3 0
    //   28: return
    //   29: new 111	com/google/android/gms/maps/GoogleMap$zza
    //   32: astore 5
    //   34: aload 5
    //   36: aload_2
    //   37: invokespecial 114	com/google/android/gms/maps/GoogleMap$zza:<init>	(Lcom/google/android/gms/maps/GoogleMap$CancelableCallback;)V
    //   40: goto -22 -> 18
    //   43: astore 5
    //   45: new 45	com/google/android/gms/maps/model/RuntimeRemoteException
    //   48: astore_3
    //   49: aload_3
    //   50: aload 5
    //   52: invokespecial 48	com/google/android/gms/maps/model/RuntimeRemoteException:<init>	(Landroid/os/RemoteException;)V
    //   55: aload_3
    //   56: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	57	0	this	GoogleMap
    //   0	57	1	paramCameraUpdate	CameraUpdate
    //   0	57	2	paramCancelableCallback	GoogleMap.CancelableCallback
    //   4	52	3	localObject1	Object
    //   9	11	4	localzzd	com.google.android.gms.dynamic.zzd
    //   16	19	5	localObject2	Object
    //   43	8	5	localRemoteException	RemoteException
    // Exception table:
    //   from	to	target	type
    //   0	4	43	android/os/RemoteException
    //   5	9	43	android/os/RemoteException
    //   21	28	43	android/os/RemoteException
    //   29	32	43	android/os/RemoteException
    //   36	40	43	android/os/RemoteException
  }
  
  public final void clear()
  {
    try
    {
      IGoogleMapDelegate localIGoogleMapDelegate = this.zzaRr;
      localIGoogleMapDelegate.clear();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public final CameraPosition getCameraPosition()
  {
    try
    {
      IGoogleMapDelegate localIGoogleMapDelegate = this.zzaRr;
      return localIGoogleMapDelegate.getCameraPosition();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  /* Error */
  public com.google.android.gms.maps.model.IndoorBuilding getFocusedBuilding()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 34	com/google/android/gms/maps/GoogleMap:zzaRr	Lcom/google/android/gms/maps/internal/IGoogleMapDelegate;
    //   4: astore_1
    //   5: aload_1
    //   6: invokeinterface 129 1 0
    //   11: astore_2
    //   12: aload_2
    //   13: ifnull +14 -> 27
    //   16: new 131	com/google/android/gms/maps/model/IndoorBuilding
    //   19: astore_1
    //   20: aload_1
    //   21: aload_2
    //   22: invokespecial 134	com/google/android/gms/maps/model/IndoorBuilding:<init>	(Lcom/google/android/gms/maps/model/internal/zzd;)V
    //   25: aload_1
    //   26: areturn
    //   27: aconst_null
    //   28: astore_1
    //   29: goto -4 -> 25
    //   32: astore_1
    //   33: new 45	com/google/android/gms/maps/model/RuntimeRemoteException
    //   36: astore_2
    //   37: aload_2
    //   38: aload_1
    //   39: invokespecial 48	com/google/android/gms/maps/model/RuntimeRemoteException:<init>	(Landroid/os/RemoteException;)V
    //   42: aload_2
    //   43: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	44	0	this	GoogleMap
    //   4	25	1	localObject1	Object
    //   32	7	1	localRemoteException	RemoteException
    //   11	32	2	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   0	4	32	android/os/RemoteException
    //   5	11	32	android/os/RemoteException
    //   16	19	32	android/os/RemoteException
    //   21	25	32	android/os/RemoteException
  }
  
  public final int getMapType()
  {
    try
    {
      IGoogleMapDelegate localIGoogleMapDelegate = this.zzaRr;
      return localIGoogleMapDelegate.getMapType();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public final float getMaxZoomLevel()
  {
    try
    {
      IGoogleMapDelegate localIGoogleMapDelegate = this.zzaRr;
      return localIGoogleMapDelegate.getMaxZoomLevel();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public final float getMinZoomLevel()
  {
    try
    {
      IGoogleMapDelegate localIGoogleMapDelegate = this.zzaRr;
      return localIGoogleMapDelegate.getMinZoomLevel();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public final Location getMyLocation()
  {
    try
    {
      IGoogleMapDelegate localIGoogleMapDelegate = this.zzaRr;
      return localIGoogleMapDelegate.getMyLocation();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public final Projection getProjection()
  {
    try
    {
      Projection localProjection = new com/google/android/gms/maps/Projection;
      localObject = this.zzaRr;
      localObject = ((IGoogleMapDelegate)localObject).getProjection();
      localProjection.<init>((IProjectionDelegate)localObject);
      return localProjection;
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
      ((RuntimeRemoteException)localObject).<init>(localRemoteException);
      throw ((Throwable)localObject);
    }
  }
  
  public final UiSettings getUiSettings()
  {
    try
    {
      UiSettings localUiSettings = this.zzaRs;
      if (localUiSettings == null)
      {
        localUiSettings = new com/google/android/gms/maps/UiSettings;
        localObject = this.zzaRr;
        localObject = ((IGoogleMapDelegate)localObject).getUiSettings();
        localUiSettings.<init>((IUiSettingsDelegate)localObject);
        this.zzaRs = localUiSettings;
      }
      return this.zzaRs;
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
      ((RuntimeRemoteException)localObject).<init>(localRemoteException);
      throw ((Throwable)localObject);
    }
  }
  
  public final boolean isBuildingsEnabled()
  {
    try
    {
      IGoogleMapDelegate localIGoogleMapDelegate = this.zzaRr;
      return localIGoogleMapDelegate.isBuildingsEnabled();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public final boolean isIndoorEnabled()
  {
    try
    {
      IGoogleMapDelegate localIGoogleMapDelegate = this.zzaRr;
      return localIGoogleMapDelegate.isIndoorEnabled();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public final boolean isMyLocationEnabled()
  {
    try
    {
      IGoogleMapDelegate localIGoogleMapDelegate = this.zzaRr;
      return localIGoogleMapDelegate.isMyLocationEnabled();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public final boolean isTrafficEnabled()
  {
    try
    {
      IGoogleMapDelegate localIGoogleMapDelegate = this.zzaRr;
      return localIGoogleMapDelegate.isTrafficEnabled();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public final void moveCamera(CameraUpdate paramCameraUpdate)
  {
    try
    {
      IGoogleMapDelegate localIGoogleMapDelegate = this.zzaRr;
      localObject = paramCameraUpdate.zzzH();
      localIGoogleMapDelegate.moveCamera((com.google.android.gms.dynamic.zzd)localObject);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
      ((RuntimeRemoteException)localObject).<init>(localRemoteException);
      throw ((Throwable)localObject);
    }
  }
  
  public final void setBuildingsEnabled(boolean paramBoolean)
  {
    try
    {
      IGoogleMapDelegate localIGoogleMapDelegate = this.zzaRr;
      localIGoogleMapDelegate.setBuildingsEnabled(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public final void setContentDescription(String paramString)
  {
    try
    {
      IGoogleMapDelegate localIGoogleMapDelegate = this.zzaRr;
      localIGoogleMapDelegate.setContentDescription(paramString);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public final boolean setIndoorEnabled(boolean paramBoolean)
  {
    try
    {
      IGoogleMapDelegate localIGoogleMapDelegate = this.zzaRr;
      return localIGoogleMapDelegate.setIndoorEnabled(paramBoolean);
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public final void setInfoWindowAdapter(GoogleMap.InfoWindowAdapter paramInfoWindowAdapter)
  {
    if (paramInfoWindowAdapter == null) {}
    for (;;)
    {
      try
      {
        localIGoogleMapDelegate = this.zzaRr;
        localObject = null;
        localIGoogleMapDelegate.setInfoWindowAdapter(null);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        IGoogleMapDelegate localIGoogleMapDelegate;
        Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
        ((RuntimeRemoteException)localObject).<init>(localRemoteException);
        throw ((Throwable)localObject);
      }
      localIGoogleMapDelegate = this.zzaRr;
      localObject = new com/google/android/gms/maps/GoogleMap$3;
      ((GoogleMap.3)localObject).<init>(this, paramInfoWindowAdapter);
      localIGoogleMapDelegate.setInfoWindowAdapter((com.google.android.gms.maps.internal.zzd)localObject);
    }
  }
  
  public final void setLocationSource(LocationSource paramLocationSource)
  {
    if (paramLocationSource == null) {}
    for (;;)
    {
      try
      {
        localIGoogleMapDelegate = this.zzaRr;
        localObject = null;
        localIGoogleMapDelegate.setLocationSource(null);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        IGoogleMapDelegate localIGoogleMapDelegate;
        Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
        ((RuntimeRemoteException)localObject).<init>(localRemoteException);
        throw ((Throwable)localObject);
      }
      localIGoogleMapDelegate = this.zzaRr;
      localObject = new com/google/android/gms/maps/GoogleMap$11;
      ((GoogleMap.11)localObject).<init>(this, paramLocationSource);
      localIGoogleMapDelegate.setLocationSource((ILocationSourceDelegate)localObject);
    }
  }
  
  public final void setMapType(int paramInt)
  {
    try
    {
      IGoogleMapDelegate localIGoogleMapDelegate = this.zzaRr;
      localIGoogleMapDelegate.setMapType(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public final void setMyLocationEnabled(boolean paramBoolean)
  {
    try
    {
      IGoogleMapDelegate localIGoogleMapDelegate = this.zzaRr;
      localIGoogleMapDelegate.setMyLocationEnabled(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public final void setOnCameraChangeListener(GoogleMap.OnCameraChangeListener paramOnCameraChangeListener)
  {
    if (paramOnCameraChangeListener == null) {}
    for (;;)
    {
      try
      {
        localIGoogleMapDelegate = this.zzaRr;
        localObject = null;
        localIGoogleMapDelegate.setOnCameraChangeListener(null);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        IGoogleMapDelegate localIGoogleMapDelegate;
        Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
        ((RuntimeRemoteException)localObject).<init>(localRemoteException);
        throw ((Throwable)localObject);
      }
      localIGoogleMapDelegate = this.zzaRr;
      localObject = new com/google/android/gms/maps/GoogleMap$12;
      ((GoogleMap.12)localObject).<init>(this, paramOnCameraChangeListener);
      localIGoogleMapDelegate.setOnCameraChangeListener((com.google.android.gms.maps.internal.zze)localObject);
    }
  }
  
  public final void setOnGroundOverlayClickListener(GoogleMap.OnGroundOverlayClickListener paramOnGroundOverlayClickListener)
  {
    if (paramOnGroundOverlayClickListener == null) {}
    for (;;)
    {
      try
      {
        localIGoogleMapDelegate = this.zzaRr;
        localObject = null;
        localIGoogleMapDelegate.setOnGroundOverlayClickListener(null);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        IGoogleMapDelegate localIGoogleMapDelegate;
        Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
        ((RuntimeRemoteException)localObject).<init>(localRemoteException);
        throw ((Throwable)localObject);
      }
      localIGoogleMapDelegate = this.zzaRr;
      localObject = new com/google/android/gms/maps/GoogleMap$7;
      ((GoogleMap.7)localObject).<init>(this, paramOnGroundOverlayClickListener);
      localIGoogleMapDelegate.setOnGroundOverlayClickListener((zzf)localObject);
    }
  }
  
  public final void setOnIndoorStateChangeListener(GoogleMap.OnIndoorStateChangeListener paramOnIndoorStateChangeListener)
  {
    if (paramOnIndoorStateChangeListener == null) {}
    for (;;)
    {
      try
      {
        localIGoogleMapDelegate = this.zzaRr;
        localObject = null;
        localIGoogleMapDelegate.setOnIndoorStateChangeListener(null);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        IGoogleMapDelegate localIGoogleMapDelegate;
        Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
        ((RuntimeRemoteException)localObject).<init>(localRemoteException);
        throw ((Throwable)localObject);
      }
      localIGoogleMapDelegate = this.zzaRr;
      localObject = new com/google/android/gms/maps/GoogleMap$1;
      ((GoogleMap.1)localObject).<init>(this, paramOnIndoorStateChangeListener);
      localIGoogleMapDelegate.setOnIndoorStateChangeListener((com.google.android.gms.maps.internal.zzg)localObject);
    }
  }
  
  public final void setOnInfoWindowClickListener(GoogleMap.OnInfoWindowClickListener paramOnInfoWindowClickListener)
  {
    if (paramOnInfoWindowClickListener == null) {}
    for (;;)
    {
      try
      {
        localIGoogleMapDelegate = this.zzaRr;
        localObject = null;
        localIGoogleMapDelegate.setOnInfoWindowClickListener(null);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        IGoogleMapDelegate localIGoogleMapDelegate;
        Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
        ((RuntimeRemoteException)localObject).<init>(localRemoteException);
        throw ((Throwable)localObject);
      }
      localIGoogleMapDelegate = this.zzaRr;
      localObject = new com/google/android/gms/maps/GoogleMap$17;
      ((GoogleMap.17)localObject).<init>(this, paramOnInfoWindowClickListener);
      localIGoogleMapDelegate.setOnInfoWindowClickListener((zzh)localObject);
    }
  }
  
  public final void setOnInfoWindowCloseListener(GoogleMap.OnInfoWindowCloseListener paramOnInfoWindowCloseListener)
  {
    if (paramOnInfoWindowCloseListener == null) {}
    for (;;)
    {
      try
      {
        localIGoogleMapDelegate = this.zzaRr;
        localObject = null;
        localIGoogleMapDelegate.setOnInfoWindowCloseListener(null);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        IGoogleMapDelegate localIGoogleMapDelegate;
        Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
        ((RuntimeRemoteException)localObject).<init>(localRemoteException);
        throw ((Throwable)localObject);
      }
      localIGoogleMapDelegate = this.zzaRr;
      localObject = new com/google/android/gms/maps/GoogleMap$2;
      ((GoogleMap.2)localObject).<init>(this, paramOnInfoWindowCloseListener);
      localIGoogleMapDelegate.setOnInfoWindowCloseListener((zzi)localObject);
    }
  }
  
  public final void setOnInfoWindowLongClickListener(GoogleMap.OnInfoWindowLongClickListener paramOnInfoWindowLongClickListener)
  {
    if (paramOnInfoWindowLongClickListener == null) {}
    for (;;)
    {
      try
      {
        localIGoogleMapDelegate = this.zzaRr;
        localObject = null;
        localIGoogleMapDelegate.setOnInfoWindowLongClickListener(null);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        IGoogleMapDelegate localIGoogleMapDelegate;
        Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
        ((RuntimeRemoteException)localObject).<init>(localRemoteException);
        throw ((Throwable)localObject);
      }
      localIGoogleMapDelegate = this.zzaRr;
      localObject = new com/google/android/gms/maps/GoogleMap$18;
      ((GoogleMap.18)localObject).<init>(this, paramOnInfoWindowLongClickListener);
      localIGoogleMapDelegate.setOnInfoWindowLongClickListener((zzj)localObject);
    }
  }
  
  public final void setOnMapClickListener(GoogleMap.OnMapClickListener paramOnMapClickListener)
  {
    if (paramOnMapClickListener == null) {}
    for (;;)
    {
      try
      {
        localIGoogleMapDelegate = this.zzaRr;
        localObject = null;
        localIGoogleMapDelegate.setOnMapClickListener(null);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        IGoogleMapDelegate localIGoogleMapDelegate;
        Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
        ((RuntimeRemoteException)localObject).<init>(localRemoteException);
        throw ((Throwable)localObject);
      }
      localIGoogleMapDelegate = this.zzaRr;
      localObject = new com/google/android/gms/maps/GoogleMap$13;
      ((GoogleMap.13)localObject).<init>(this, paramOnMapClickListener);
      localIGoogleMapDelegate.setOnMapClickListener((zzl)localObject);
    }
  }
  
  public void setOnMapLoadedCallback(GoogleMap.OnMapLoadedCallback paramOnMapLoadedCallback)
  {
    if (paramOnMapLoadedCallback == null) {}
    for (;;)
    {
      try
      {
        localIGoogleMapDelegate = this.zzaRr;
        localObject = null;
        localIGoogleMapDelegate.setOnMapLoadedCallback(null);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        IGoogleMapDelegate localIGoogleMapDelegate;
        Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
        ((RuntimeRemoteException)localObject).<init>(localRemoteException);
        throw ((Throwable)localObject);
      }
      localIGoogleMapDelegate = this.zzaRr;
      localObject = new com/google/android/gms/maps/GoogleMap$6;
      ((GoogleMap.6)localObject).<init>(this, paramOnMapLoadedCallback);
      localIGoogleMapDelegate.setOnMapLoadedCallback((zzm)localObject);
    }
  }
  
  public final void setOnMapLongClickListener(GoogleMap.OnMapLongClickListener paramOnMapLongClickListener)
  {
    if (paramOnMapLongClickListener == null) {}
    for (;;)
    {
      try
      {
        localIGoogleMapDelegate = this.zzaRr;
        localObject = null;
        localIGoogleMapDelegate.setOnMapLongClickListener(null);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        IGoogleMapDelegate localIGoogleMapDelegate;
        Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
        ((RuntimeRemoteException)localObject).<init>(localRemoteException);
        throw ((Throwable)localObject);
      }
      localIGoogleMapDelegate = this.zzaRr;
      localObject = new com/google/android/gms/maps/GoogleMap$14;
      ((GoogleMap.14)localObject).<init>(this, paramOnMapLongClickListener);
      localIGoogleMapDelegate.setOnMapLongClickListener((zzn)localObject);
    }
  }
  
  public final void setOnMarkerClickListener(GoogleMap.OnMarkerClickListener paramOnMarkerClickListener)
  {
    if (paramOnMarkerClickListener == null) {}
    for (;;)
    {
      try
      {
        localIGoogleMapDelegate = this.zzaRr;
        localObject = null;
        localIGoogleMapDelegate.setOnMarkerClickListener(null);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        IGoogleMapDelegate localIGoogleMapDelegate;
        Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
        ((RuntimeRemoteException)localObject).<init>(localRemoteException);
        throw ((Throwable)localObject);
      }
      localIGoogleMapDelegate = this.zzaRr;
      localObject = new com/google/android/gms/maps/GoogleMap$15;
      ((GoogleMap.15)localObject).<init>(this, paramOnMarkerClickListener);
      localIGoogleMapDelegate.setOnMarkerClickListener((zzp)localObject);
    }
  }
  
  public final void setOnMarkerDragListener(GoogleMap.OnMarkerDragListener paramOnMarkerDragListener)
  {
    if (paramOnMarkerDragListener == null) {}
    for (;;)
    {
      try
      {
        localIGoogleMapDelegate = this.zzaRr;
        localObject = null;
        localIGoogleMapDelegate.setOnMarkerDragListener(null);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        IGoogleMapDelegate localIGoogleMapDelegate;
        Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
        ((RuntimeRemoteException)localObject).<init>(localRemoteException);
        throw ((Throwable)localObject);
      }
      localIGoogleMapDelegate = this.zzaRr;
      localObject = new com/google/android/gms/maps/GoogleMap$16;
      ((GoogleMap.16)localObject).<init>(this, paramOnMarkerDragListener);
      localIGoogleMapDelegate.setOnMarkerDragListener((zzq)localObject);
    }
  }
  
  public final void setOnMyLocationButtonClickListener(GoogleMap.OnMyLocationButtonClickListener paramOnMyLocationButtonClickListener)
  {
    if (paramOnMyLocationButtonClickListener == null) {}
    for (;;)
    {
      try
      {
        localIGoogleMapDelegate = this.zzaRr;
        localObject = null;
        localIGoogleMapDelegate.setOnMyLocationButtonClickListener(null);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        IGoogleMapDelegate localIGoogleMapDelegate;
        Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
        ((RuntimeRemoteException)localObject).<init>(localRemoteException);
        throw ((Throwable)localObject);
      }
      localIGoogleMapDelegate = this.zzaRr;
      localObject = new com/google/android/gms/maps/GoogleMap$5;
      ((GoogleMap.5)localObject).<init>(this, paramOnMyLocationButtonClickListener);
      localIGoogleMapDelegate.setOnMyLocationButtonClickListener((zzr)localObject);
    }
  }
  
  public final void setOnMyLocationChangeListener(GoogleMap.OnMyLocationChangeListener paramOnMyLocationChangeListener)
  {
    if (paramOnMyLocationChangeListener == null) {}
    for (;;)
    {
      try
      {
        localIGoogleMapDelegate = this.zzaRr;
        localObject = null;
        localIGoogleMapDelegate.setOnMyLocationChangeListener(null);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        IGoogleMapDelegate localIGoogleMapDelegate;
        Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
        ((RuntimeRemoteException)localObject).<init>(localRemoteException);
        throw ((Throwable)localObject);
      }
      localIGoogleMapDelegate = this.zzaRr;
      localObject = new com/google/android/gms/maps/GoogleMap$4;
      ((GoogleMap.4)localObject).<init>(this, paramOnMyLocationChangeListener);
      localIGoogleMapDelegate.setOnMyLocationChangeListener((zzs)localObject);
    }
  }
  
  public final void setOnPolygonClickListener(GoogleMap.OnPolygonClickListener paramOnPolygonClickListener)
  {
    if (paramOnPolygonClickListener == null) {}
    for (;;)
    {
      try
      {
        localIGoogleMapDelegate = this.zzaRr;
        localObject = null;
        localIGoogleMapDelegate.setOnPolygonClickListener(null);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        IGoogleMapDelegate localIGoogleMapDelegate;
        Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
        ((RuntimeRemoteException)localObject).<init>(localRemoteException);
        throw ((Throwable)localObject);
      }
      localIGoogleMapDelegate = this.zzaRr;
      localObject = new com/google/android/gms/maps/GoogleMap$8;
      ((GoogleMap.8)localObject).<init>(this, paramOnPolygonClickListener);
      localIGoogleMapDelegate.setOnPolygonClickListener((zzu)localObject);
    }
  }
  
  public final void setOnPolylineClickListener(GoogleMap.OnPolylineClickListener paramOnPolylineClickListener)
  {
    if (paramOnPolylineClickListener == null) {}
    for (;;)
    {
      try
      {
        localIGoogleMapDelegate = this.zzaRr;
        localObject = null;
        localIGoogleMapDelegate.setOnPolylineClickListener(null);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        IGoogleMapDelegate localIGoogleMapDelegate;
        Object localObject = new com/google/android/gms/maps/model/RuntimeRemoteException;
        ((RuntimeRemoteException)localObject).<init>(localRemoteException);
        throw ((Throwable)localObject);
      }
      localIGoogleMapDelegate = this.zzaRr;
      localObject = new com/google/android/gms/maps/GoogleMap$9;
      ((GoogleMap.9)localObject).<init>(this, paramOnPolylineClickListener);
      localIGoogleMapDelegate.setOnPolylineClickListener((zzv)localObject);
    }
  }
  
  public final void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    try
    {
      IGoogleMapDelegate localIGoogleMapDelegate = this.zzaRr;
      localIGoogleMapDelegate.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public final void setTrafficEnabled(boolean paramBoolean)
  {
    try
    {
      IGoogleMapDelegate localIGoogleMapDelegate = this.zzaRr;
      localIGoogleMapDelegate.setTrafficEnabled(paramBoolean);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  public final void snapshot(GoogleMap.SnapshotReadyCallback paramSnapshotReadyCallback)
  {
    snapshot(paramSnapshotReadyCallback, null);
  }
  
  public final void snapshot(GoogleMap.SnapshotReadyCallback paramSnapshotReadyCallback, Bitmap paramBitmap)
  {
    if (paramBitmap != null) {}
    for (Object localObject1 = com.google.android.gms.dynamic.zze.zzC(paramBitmap);; localObject1 = null)
    {
      localObject1 = (com.google.android.gms.dynamic.zze)localObject1;
      try
      {
        localObject2 = this.zzaRr;
        GoogleMap.10 local10 = new com/google/android/gms/maps/GoogleMap$10;
        local10.<init>(this, paramSnapshotReadyCallback);
        ((IGoogleMapDelegate)localObject2).snapshot(local10, (com.google.android.gms.dynamic.zzd)localObject1);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject2 = new com/google/android/gms/maps/model/RuntimeRemoteException;
        ((RuntimeRemoteException)localObject2).<init>(localRemoteException);
        throw ((Throwable)localObject2);
      }
    }
  }
  
  public final void stopAnimation()
  {
    try
    {
      IGoogleMapDelegate localIGoogleMapDelegate = this.zzaRr;
      localIGoogleMapDelegate.stopAnimation();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
  
  IGoogleMapDelegate zzzJ()
  {
    return this.zzaRr;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\GoogleMap.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */