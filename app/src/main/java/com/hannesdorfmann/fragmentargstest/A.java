package com.hannesdorfmann.fragmentargstest;

import android.app.Fragment;
import com.hannesdorfmann.fragmentargs.annotation.Arg;
import com.hannesdorfmann.fragmentargs.annotation.FragmentWithArgs;

/**
 * @author Hannes Dorfmann
 */
@FragmentWithArgs
public abstract class A extends Fragment {

  @Arg
  int a;
}
