package tp.skt.onem2m.binder.mqtt_v1_1.request;


import android.support.annotation.CheckResult;

import org.simpleframework.xml.Default;
import org.simpleframework.xml.DefaultType;
import org.simpleframework.xml.Namespace;
import org.simpleframework.xml.Root;

import tp.skt.onem2m.binder.mqtt_v1_1.Definitions;
import tp.skt.onem2m.common.MQTTConst;

/**
 * subscription request
 * <p>
 * Copyright (C) 2017. SK Telecom, All Rights Reserved.
 * Written 2017, by SK Telecom
 */
@Root(name = "req")
@Namespace(prefix = "m2m", reference = "http://www.onem2m.org/xml/protocols")
@Default(DefaultType.FIELD)
public class subscription extends RequestBase {

    /**
     * subscription constructor
     *
     * @param builder
     */
    private subscription(Builder builder) {
        super(builder);
    }

    /**
     * subscription Builder
     */
    public static class Builder extends RequestBase.Builder {
        /**
         * resourceStatus
         **/
        private String rss;
        /**
         * notificationURI
         **/
        private String nu;
        /**
         * notificationContentType
         **/
        private String nct;

        /**
         * Builder constructor
         *
         * @param op
         */
        public Builder(@Definitions.Operation int op) {
            super(op, Definitions.ResourceType.subscription);
        }

        public Builder nm(String nm) {
            this.nm = nm;
            return this;
        }

        public Builder rss(String rss) {
            this.rss = rss;
            return this;
        }

        public Builder nu(String nu) {
            this.nu = nu;
            return this;
        }

        public Builder nct(String nct) {
            this.nct = nct;
            return this;
        }

        public Builder to(String to) {
            this.to = to;
            return this;
        }

        public Builder uKey(String uKey) {
            this.uKey = uKey;
            return this;
        }

        @Override
        Content getContent() {
            Content content = new Content();
            content.sub = new Content.Sub(new Content.Enc(rss), nu, nct);
            return content;
        }

        @Override
        String getTo() {
            return null;
        }

        @Override
        String getDefaultResourceName() {
            return null;
        }

        @CheckResult
        public subscription build() { // throws Exception {
            subscription build = new subscription(this);
            return build;
        }
    }
}
