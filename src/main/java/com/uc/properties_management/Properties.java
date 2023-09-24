package com.uc.properties_management;

import org.aeonbits.owner.Config;

@Config.Sources({"file:./application.properties"})
public interface Properties extends Config {
    @Config.Key("opencv.dnn.backend")
    String backend();
    @Config.Key("opencv.dnn.target")
    String target();
    @Config.Key("model.base.path.platform.windows")
    String modelBasePathLinux();
    @Config.Key("model.base.path.platform.linux")
    String modelBasePathWindows();
    @Config.Key("opencv.model.result.limit")
    double opencvModelResultLimit();
    @Config.Key("opencv.model.arrow.input.size")
    int opencvModelArrowInputSize();
    @Config.Key("opencv.model.detail.input.size")
    int opencvModelDetailInputSize();
}
