# CalculatorApp
Calculator app created with Java in Android Studio.

E/BoostFramework: BoostFramework() : Exception_1 = java.lang.NoSuchMethodException: perfIOPrefetchStart [int, class java.lang.String]
E/BoostFramework: BoostFramework() : Exception_1 = java.lang.NoSuchMethodException: perfIOPrefetchStart [int, class java.lang.String]
D/AndroidRuntime: Shutting down VM
E/AndroidRuntime: FATAL EXCEPTION: main
                  Process: com.laminar.calculator.calculator, PID: 26664
                  java.lang.RuntimeException: Unable to start activity ComponentInfo{com.laminar.calculator.calculator/com.laminar.calculator.calculator.Efficiency}: java.lang.IllegalStateException: This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.
                      at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:2946)
                      at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:3046)
                      at android.app.ActivityThread.-wrap11(Unknown Source:0)
                      at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1688)
                      at android.os.Handler.dispatchMessage(Handler.java:105)
                      at android.os.Looper.loop(Looper.java:164)
                      at android.app.ActivityThread.main(ActivityThread.java:6809)
                      at java.lang.reflect.Method.invoke(Native Method)
                      at com.android.internal.os.Zygote$MethodAndArgsCaller.run(Zygote.java:240)
                      at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:767)
                   Caused by: java.lang.IllegalStateException: This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.
                      at android.support.v7.app.AppCompatDelegateImplV9.setSupportActionBar(AppCompatDelegateImplV9.java:207)
                      at android.support.v7.app.AppCompatActivity.setSupportActionBar(AppCompatActivity.java:130)
                      at com.laminar.calculator.calculator.Efficiency.onCreate(Efficiency.java:18)
                      at android.app.Activity.performCreate(Activity.java:6998)
                      at android.app.Instrumentation.callActivityOnCreate(Instrumentation.java:1230)
                      at android.app.ActivityThread.performLaunchActivity(ActivityThread.java:2899)
                      at android.app.ActivityThread.handleLaunchActivity(ActivityThread.java:3046) 
                      at android.app.ActivityThread.-wrap11(Unknown Source:0) 
                      at android.app.ActivityThread$H.handleMessage(ActivityThread.java:1688) 
                      at android.os.Handler.dispatchMessage(Handler.java:105) 
                      at android.os.Looper.loop(Looper.java:164) 
                      at android.app.ActivityThread.main(ActivityThread.java:6809) 
                      at java.lang.reflect.Method.invoke(Native Method) 
                      at com.android.internal.os.Zygote$MethodAndArgsCaller.run(Zygote.java:240) 
                      at com.android.internal.os.ZygoteInit.main(ZygoteInit.java:767) 
D/AppTracker: App Event: crash
