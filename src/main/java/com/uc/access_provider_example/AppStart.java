package com.uc.access_provider_example;

import com.uc.access_provider_example.model.AccessInPackage;
import com.uc.access_provider_example.model.child_packgate.AccessInChildPackage;
import com.uc.access_provider_example.service.AccessOutOfPackage;

public class AppStart {
    public static void main(String[] args) {
        AccessInChildPackage.access();
        AccessInPackage.access();
        AccessOutOfPackage.access();
        AccessInParentPackage.access();
    }
}
