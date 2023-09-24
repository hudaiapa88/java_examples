package com.uc.enum_implement;

public enum Days implements Operation{
    Monday{
        @Override
        public String getDay() {
            return "Monday";
        }
    },
    Tuesday{
        @Override
        public String getDay() {
            return "Tuesday";
        }
    },
    Wednesday{
        @Override
        public String getDay() {
            return "Wednesday";
        }
    },
    Thursday{
        @Override
        public String getDay() {
            return "Thursday";
        }
    },
    Friday{
        @Override
        public String getDay() {
            return "Friday";
        }
    },
    Saturday{
        @Override
        public String getDay() {
            return "Saturday";
        }
    },
    Sunday{
        @Override
        public String getDay() {
            return "Sunday";
        }
    }
    ;

    Days() {

    }
}
