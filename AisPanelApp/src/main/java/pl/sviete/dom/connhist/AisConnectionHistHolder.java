package pl.sviete.dom.connhist;

public class AisConnectionHistHolder {

        public String connUrl;
        public String connName;
        public String connTime;
        public String gateID;

        public AisConnectionHistHolder(){

        }

        public AisConnectionHistHolder(String connUrl, String connName, String connTime, String gateID) {

            this.connUrl = connUrl;
            this.connName = connName;
            this.connTime = connTime;
            this.gateID = gateID;
        }
    }