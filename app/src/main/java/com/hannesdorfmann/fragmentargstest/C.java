package com.hannesdorfmann.fragmentargstest;

import android.os.Bundle;
import com.hannesdorfmann.fragmentargs.FragmentArgs;
import com.hannesdorfmann.fragmentargs.annotation.Arg;
import com.hannesdorfmann.fragmentargs.annotation.FragmentWithArgs;
import com.hannesdorfmann.fragmentargs.bundler.ParcelerArgsBundler;

/**
 * @author Hannes Dorfmann
 */
@FragmentWithArgs public class C extends B {

  @Arg(bundler = UnsupportedDataBundler.class) UnsupportedData foo;
  private @Arg(bundler = UnsupportedDataBundler.class) UnsupportedData mOtherFoo;

  @Arg(bundler = ParcelerArgsBundler.class, required = false) ParcelerModel model;

  @Override public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    FragmentArgs.inject(this);
  }

  public void setMOtherFoo(UnsupportedData mOtherFoo) {
    this.mOtherFoo = mOtherFoo;
  }
}
