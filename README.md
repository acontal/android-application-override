This toy project shows how to override the Application object in an Android project, so that production code and test code see a different Application object.

If you get the exception "java.lang.IllegalAccessError: Class ref in pre-verified class resolved to unexpected implementation", try to disable the checking mechanism.

    adb shell setprop dalvik.vm.dexopt-flags v=n,o=v
    adb shell stop
    adb shell start

It works with API 19, but not with API 10.
