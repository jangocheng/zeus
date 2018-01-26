/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.f6car.base.rlt;

/**
 * @author qixiaobo
 */
public class CsbParam {

    /**
     * AlarmInfoPlate : {"channel":0,"deviceName":"default","ipaddr":"192.168.0.100","result":{"PlateResult":{"bright":0,"carBright":0,"carColor":0,"colorType":0,"colorValue":0,"confidence":0,"direction":0,"license":"_无_","location":{"RECT":{"bottom":0,"left":0,"right":0,"top":0}},"timeStamp":{"Timeval":{"sec":1441815171,"usec":672241}},"timeUsed":0,"triggerType":1,"type":0}},"serialno":"e10b2d6c8c07b422361457935b518642"}
     */

    private AlarmInfoPlateBean AlarmInfoPlate;

    public AlarmInfoPlateBean getAlarmInfoPlate() {
        return AlarmInfoPlate;
    }

    public void setAlarmInfoPlate(AlarmInfoPlateBean AlarmInfoPlate) {
        this.AlarmInfoPlate = AlarmInfoPlate;
    }

    public static class AlarmInfoPlateBean {
        /**
         * channel : 0
         * deviceName : default
         * ipaddr : 192.168.0.100
         * result : {"PlateResult":{"bright":0,"carBright":0,"carColor":0,"colorType":0,"colorValue":0,"confidence":0,"direction":0,"license":"_无_","location":{"RECT":{"bottom":0,"left":0,"right":0,"top":0}},"timeStamp":{"Timeval":{"sec":1441815171,"usec":672241}},"timeUsed":0,"triggerType":1,"type":0}}
         * serialno : e10b2d6c8c07b422361457935b518642
         */

        private int channel;
        private String deviceName;
        private String ipaddr;
        private ResultBean result;
        private String serialno;

        public int getChannel() {
            return channel;
        }

        public void setChannel(int channel) {
            this.channel = channel;
        }

        public String getDeviceName() {
            return deviceName;
        }

        public void setDeviceName(String deviceName) {
            this.deviceName = deviceName;
        }

        public String getIpaddr() {
            return ipaddr;
        }

        public void setIpaddr(String ipaddr) {
            this.ipaddr = ipaddr;
        }

        public ResultBean getResult() {
            return result;
        }

        public void setResult(ResultBean result) {
            this.result = result;
        }

        public String getSerialno() {
            return serialno;
        }

        public void setSerialno(String serialno) {
            this.serialno = serialno;
        }

        public static class ResultBean {
            /**
             * PlateResult : {"bright":0,"carBright":0,"carColor":0,"colorType":0,"colorValue":0,"confidence":0,"direction":0,"license":"_无_","location":{"RECT":{"bottom":0,"left":0,"right":0,"top":0}},"timeStamp":{"Timeval":{"sec":1441815171,"usec":672241}},"timeUsed":0,"triggerType":1,"type":0}
             */

            private PlateResultBean PlateResult;

            public PlateResultBean getPlateResult() {
                return PlateResult;
            }

            public void setPlateResult(PlateResultBean PlateResult) {
                this.PlateResult = PlateResult;
            }

            public static class PlateResultBean {
                /**
                 * bright : 0
                 * carBright : 0
                 * carColor : 0
                 * colorType : 0
                 * colorValue : 0
                 * confidence : 0
                 * direction : 0
                 * license : _无_
                 * location : {"RECT":{"bottom":0,"left":0,"right":0,"top":0}}
                 * timeStamp : {"Timeval":{"sec":1441815171,"usec":672241}}
                 * timeUsed : 0
                 * triggerType : 1
                 * type : 0
                 */

                private int bright;
                private int carBright;
                private int carColor;
                private int colorType;
                private int colorValue;
                private int confidence;
                private int direction;
                private String license;
                private LocationBean location;
                private TimeStampBean timeStamp;
                private int timeUsed;
                private int triggerType;
                private int type;

                public int getBright() {
                    return bright;
                }

                public void setBright(int bright) {
                    this.bright = bright;
                }

                public int getCarBright() {
                    return carBright;
                }

                public void setCarBright(int carBright) {
                    this.carBright = carBright;
                }

                public int getCarColor() {
                    return carColor;
                }

                public void setCarColor(int carColor) {
                    this.carColor = carColor;
                }

                public int getColorType() {
                    return colorType;
                }

                public void setColorType(int colorType) {
                    this.colorType = colorType;
                }

                public int getColorValue() {
                    return colorValue;
                }

                public void setColorValue(int colorValue) {
                    this.colorValue = colorValue;
                }

                public int getConfidence() {
                    return confidence;
                }

                public void setConfidence(int confidence) {
                    this.confidence = confidence;
                }

                public int getDirection() {
                    return direction;
                }

                public void setDirection(int direction) {
                    this.direction = direction;
                }

                public String getLicense() {
                    return license;
                }

                public void setLicense(String license) {
                    this.license = license;
                }

                public LocationBean getLocation() {
                    return location;
                }

                public void setLocation(LocationBean location) {
                    this.location = location;
                }

                public TimeStampBean getTimeStamp() {
                    return timeStamp;
                }

                public void setTimeStamp(TimeStampBean timeStamp) {
                    this.timeStamp = timeStamp;
                }

                public int getTimeUsed() {
                    return timeUsed;
                }

                public void setTimeUsed(int timeUsed) {
                    this.timeUsed = timeUsed;
                }

                public int getTriggerType() {
                    return triggerType;
                }

                public void setTriggerType(int triggerType) {
                    this.triggerType = triggerType;
                }

                public int getType() {
                    return type;
                }

                public void setType(int type) {
                    this.type = type;
                }

                public static class LocationBean {
                    /**
                     * RECT : {"bottom":0,"left":0,"right":0,"top":0}
                     */

                    private RECTBean RECT;

                    public RECTBean getRECT() {
                        return RECT;
                    }

                    public void setRECT(RECTBean RECT) {
                        this.RECT = RECT;
                    }

                    public static class RECTBean {
                        /**
                         * bottom : 0
                         * left : 0
                         * right : 0
                         * top : 0
                         */

                        private int bottom;
                        private int left;
                        private int right;
                        private int top;

                        public int getBottom() {
                            return bottom;
                        }

                        public void setBottom(int bottom) {
                            this.bottom = bottom;
                        }

                        public int getLeft() {
                            return left;
                        }

                        public void setLeft(int left) {
                            this.left = left;
                        }

                        public int getRight() {
                            return right;
                        }

                        public void setRight(int right) {
                            this.right = right;
                        }

                        public int getTop() {
                            return top;
                        }

                        public void setTop(int top) {
                            this.top = top;
                        }
                    }
                }

                public static class TimeStampBean {
                    /**
                     * Timeval : {"sec":1441815171,"usec":672241}
                     */

                    private TimevalBean Timeval;

                    public TimevalBean getTimeval() {
                        return Timeval;
                    }

                    public void setTimeval(TimevalBean Timeval) {
                        this.Timeval = Timeval;
                    }

                    public static class TimevalBean {
                        /**
                         * sec : 1441815171
                         * usec : 672241
                         */

                        private int sec;
                        private int usec;

                        public int getSec() {
                            return sec;
                        }

                        public void setSec(int sec) {
                            this.sec = sec;
                        }

                        public int getUsec() {
                            return usec;
                        }

                        public void setUsec(int usec) {
                            this.usec = usec;
                        }
                    }
                }
            }
        }
    }
}

