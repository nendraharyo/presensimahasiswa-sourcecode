package id.ac.ugm.presensi.presensimahasiswa.Home.response;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.DrawerLayout.c;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.OnItemTouchListener;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import id.ac.ugm.presensi.presensimahasiswa.Home.a.h;
import java.util.ArrayList;
import java.util.List;

public class FragmentDrawer
  extends Fragment
{
  private static String a = FragmentDrawer.class.getSimpleName();
  private static String[] g = null;
  private RecyclerView b;
  private ActionBarDrawerToggle c;
  private DrawerLayout d;
  private id.ac.ugm.presensi.presensimahasiswa.Home.a.i e;
  private View f;
  private FragmentDrawer.b h;
  
  public static List a()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i = 0;
    for (;;)
    {
      Object localObject = g;
      int j = localObject.length;
      if (i >= j) {
        break;
      }
      localObject = new id/ac/ugm/presensi/presensimahasiswa/Home/a/h;
      ((h)localObject).<init>();
      String str = g[i];
      ((h)localObject).a(str);
      localArrayList.add(localObject);
      i += 1;
    }
    return localArrayList;
  }
  
  public void a(int paramInt, DrawerLayout paramDrawerLayout, Toolbar paramToolbar)
  {
    Object localObject1 = getActivity().findViewById(paramInt);
    this.f = ((View)localObject1);
    this.d = paramDrawerLayout;
    localObject1 = new id/ac/ugm/presensi/presensimahasiswa/Home/response/FragmentDrawer$2;
    android.support.v4.app.i locali = getActivity();
    Object localObject2 = this;
    ((FragmentDrawer.2)localObject1).<init>(this, locali, paramDrawerLayout, paramToolbar, 2131689690, 2131689689, paramToolbar);
    this.c = ((ActionBarDrawerToggle)localObject1);
    localObject1 = this.d;
    localObject2 = this.c;
    ((DrawerLayout)localObject1).setDrawerListener((DrawerLayout.c)localObject2);
    localObject1 = this.d;
    localObject2 = new id/ac/ugm/presensi/presensimahasiswa/Home/response/FragmentDrawer$3;
    ((FragmentDrawer.3)localObject2).<init>(this);
    ((DrawerLayout)localObject1).post((Runnable)localObject2);
  }
  
  public void a(FragmentDrawer.b paramb)
  {
    this.h = paramb;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    g = getActivity().getResources().getStringArray(2130903040);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    View localView = paramLayoutInflater.inflate(2131427390, paramViewGroup, false);
    Object localObject1 = (RecyclerView)localView.findViewById(2131296355);
    this.b = ((RecyclerView)localObject1);
    localObject1 = new id/ac/ugm/presensi/presensimahasiswa/Home/a/i;
    Object localObject2 = getActivity();
    Object localObject3 = a();
    ((id.ac.ugm.presensi.presensimahasiswa.Home.a.i)localObject1).<init>((Context)localObject2, (List)localObject3);
    this.e = ((id.ac.ugm.presensi.presensimahasiswa.Home.a.i)localObject1);
    localObject1 = this.b;
    localObject2 = this.e;
    ((RecyclerView)localObject1).setAdapter((RecyclerView.Adapter)localObject2);
    localObject1 = this.b;
    localObject2 = new android/support/v7/widget/LinearLayoutManager;
    localObject3 = getActivity();
    ((LinearLayoutManager)localObject2).<init>((Context)localObject3);
    ((RecyclerView)localObject1).setLayoutManager((RecyclerView.LayoutManager)localObject2);
    localObject1 = this.b;
    localObject2 = new id/ac/ugm/presensi/presensimahasiswa/Home/response/FragmentDrawer$c;
    localObject3 = getActivity();
    RecyclerView localRecyclerView = this.b;
    FragmentDrawer.1 local1 = new id/ac/ugm/presensi/presensimahasiswa/Home/response/FragmentDrawer$1;
    local1.<init>(this);
    ((FragmentDrawer.c)localObject2).<init>((Context)localObject3, localRecyclerView, local1);
    ((RecyclerView)localObject1).addOnItemTouchListener((RecyclerView.OnItemTouchListener)localObject2);
    return localView;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\Home\response\FragmentDrawer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */