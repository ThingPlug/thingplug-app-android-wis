package tp.skt.onem2m.binder.mqtt_v1_1.response;


import com.google.gson.annotations.Expose;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import tp.skt.onem2m.binder.mqtt_v1_1.Definitions;
import tp.skt.onem2m.net.mqtt.MQTTUtils;

/**
 * subscriptionResponse response
 * <p>
 * Copyright (C) 2017. SK Telecom, All Rights Reserved.
 * Written 2017, by SK Telecom
 */
@Root(strict = false)
public class subscriptionResponse extends ResponseBase {

    @Element(required = false)
    private Pc pc;

    /**
     * get resource type
     *
     * @return ty
     */
    public String getTy() {
        return pc.sub.ty;
    }

    /**
     * get resource id
     *
     * @return ri
     */
    public String getRi() {
        return pc.sub.ri;
    }

    /**
     * get resource name
     *
     * @return rn
     */
    public String getRn() {
        return pc.sub.rn;
    }

    /**
     * get parent id
     *
     * @return pi
     */
    public String getPi() {
        return pc.sub.pi;
    }

    /**
     * get creation time
     *
     * @return ct
     */
    public String getCt() {
        return pc.sub.ct;
    }

    /**
     * get last modified time
     *
     * @return lt
     */
    public String getLt() {
        return pc.sub.lt;
    }

    /**
     * get resourceStatus
     *
     * @return st
     */
    public String getRss() {
        return pc.sub.enc.rss;
    }

    /**
     * get notificationURI
     *
     * @return st
     */
    public String getNu() {
        return pc.sub.nu;
    }

    /**
     * get notificationContentType
     *
     * @return cr
     */
    public String getNct() {
        return pc.sub.nct;
    }

    @Root
    private static class Pc {

        @Element(required = false)
        private Sub sub;

        @Root
        private static class Sub {
            @Expose
            @Element(required = false)
            private String ty;

            @Expose
            @Element(required = false)
            private String ri;

            @Expose
            @Element(required = false)
            private String rn;

            @Expose
            @Element(required = false)
            private String pi;

            @Expose
            @Element(required = false)
            private String ct;

            @Expose
            @Element(required = false)
            private String lt;

            @Expose
            @Element(required = false)
            private String nu;

            @Expose
            @Element(required = false)
            private String nct;

            @Element(required = false)
            private Enc enc;

            @Root
            private static class Enc {
                @Expose
                @Element(required = false)
                private String rss;
            }

        }
    }

    @Override
    public String getRequestIdentifier() {
        return null;
    }

    @Override
    public void print() {
        MQTTUtils.log("[" + Definitions.getResourceName(Definitions.ResourceType.subscription) + "]");
        super.print();
        if (pc.sub == null) return;
        MQTTUtils.log("ty : " + pc.sub.ty);
        MQTTUtils.log("ri : " + pc.sub.ri);
        MQTTUtils.log("rn : " + pc.sub.rn);
        MQTTUtils.log("ct : " + pc.sub.ct);
        MQTTUtils.log("lt : " + pc.sub.lt);
        MQTTUtils.log("nu : " + pc.sub.nu);
        MQTTUtils.log("nct : " + pc.sub.nct);
        if(pc.sub.enc == null) return;
        MQTTUtils.log("enc.rss : " + pc.sub.enc.rss);
    }
}
