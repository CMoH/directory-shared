/*
 *   Licensed to the Apache Software Foundation (ASF) under one
 *   or more contributor license agreements.  See the NOTICE file
 *   distributed with this work for additional information
 *   regarding copyright ownership.  The ASF licenses this file
 *   to you under the Apache License, Version 2.0 (the
 *   "License"); you may not use this file except in compliance
 *   with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing,
 *   software distributed under the License is distributed on an
 *   "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *   KIND, either express or implied.  See the License for the
 *   specific language governing permissions and limitations
 *   under the License.
 *
 */

package org.apache.directory.shared.i18n;


import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;


/**
 * Provides i18n handling of error codes.
 * About formatting see also {@link MessageFormat}
 *
 * @author <a href="mailto:dev@directory.apache.org">Apache Directory Project</a>
 */
public class I18n
{
    private final static ResourceBundle errBundle = ResourceBundle
        .getBundle( "org/apache/directory/shared/i18n/errors" );
    private final static ResourceBundle msgBundle = ResourceBundle
        .getBundle( "org/apache/directory/shared/i18n/messages" );

	// asn1
	public static final String ERR_00001 = "ERR_00001";
	public static final String ERR_00002 = "ERR_00002";
	public static final String ERR_00003 = "ERR_00003";
	public static final String ERR_00004 = "ERR_00004";
	public static final String ERR_00005 = "ERR_00005";
	public static final String ERR_00006 = "ERR_00006";
	public static final String ERR_00007 = "ERR_00007";
	public static final String ERR_00008 = "ERR_00008";
	public static final String ERR_00009 = "ERR_00009";
	public static final String ERR_00010 = "ERR_00010";
	public static final String ERR_00011 = "ERR_00011";
	public static final String ERR_00012 = "ERR_00012";
	public static final String ERR_00013 = "ERR_00013";
	public static final String ERR_00014 = "ERR_00014";
	public static final String ERR_00015 = "ERR_00015";
	public static final String ERR_00016 = "ERR_00016";
	public static final String ERR_00017 = "ERR_00017";
	public static final String ERR_00018 = "ERR_00018";
	public static final String ERR_00019 = "ERR_00019";
	public static final String ERR_00020 = "ERR_00020";
	public static final String ERR_00021 = "ERR_00021";
	public static final String ERR_00022 = "ERR_00022";
	public static final String ERR_00023 = "ERR_00023";
	public static final String ERR_00024 = "ERR_00024";
	public static final String ERR_00025 = "ERR_00025";
	public static final String ERR_00026 = "ERR_00026";
	public static final String ERR_00027 = "ERR_00027";
	public static final String ERR_00028 = "ERR_00028";
	public static final String ERR_00029 = "ERR_00029";
	public static final String ERR_00030 = "ERR_00030";
	public static final String ERR_00031 = "ERR_00031";
	public static final String ERR_00032 = "ERR_00032";
	public static final String ERR_00033 = "ERR_00033";
	public static final String ERR_00034 = "ERR_00034";
	public static final String ERR_00035 = "ERR_00035";
	public static final String ERR_00036 = "ERR_00036";
	public static final String ERR_00037 = "ERR_00037";
	public static final String ERR_00038 = "ERR_00038";
	public static final String ERR_00039 = "ERR_00039";
	public static final String ERR_00040 = "ERR_00040";
	public static final String ERR_00041 = "ERR_00041";
	
	// asn1-codec
	public static final String ERR_01001 = "ERR_01001";

	// cursor
	public static final String ERR_02001 = "ERR_02001";
	public static final String ERR_02002 = "ERR_02002";
	public static final String ERR_02003 = "ERR_02003";
	public static final String ERR_02004 = "ERR_02004";
	public static final String ERR_02005 = "ERR_02005";
	public static final String ERR_02006 = "ERR_02006";
	public static final String ERR_02007 = "ERR_02007";
	public static final String ERR_02008 = "ERR_02008";
	public static final String ERR_02009 = "ERR_02009";
	public static final String ERR_02010 = "ERR_02010";
	public static final String ERR_02011 = "ERR_02011";
	public static final String ERR_02012 = "ERR_02012";
	public static final String ERR_02013 = "ERR_02013";

	// dsml-parser
	public static final String ERR_03001 = "ERR_03001";
	public static final String ERR_03002 = "ERR_03002";
	public static final String ERR_03003 = "ERR_03003";
	public static final String ERR_03004 = "ERR_03004";
	public static final String ERR_03005 = "ERR_03005";
	public static final String ERR_03006 = "ERR_03006";
	public static final String ERR_03007 = "ERR_03007";
	public static final String ERR_03008 = "ERR_03008";
	public static final String ERR_03009 = "ERR_03009";
	public static final String ERR_03010 = "ERR_03010";
	public static final String ERR_03011 = "ERR_03011";
	public static final String ERR_03012 = "ERR_03012";
	public static final String ERR_03013 = "ERR_03013";
	public static final String ERR_03014 = "ERR_03014";
	public static final String ERR_03015 = "ERR_03015";
	public static final String ERR_03016 = "ERR_03016";
	public static final String ERR_03017 = "ERR_03017";
	public static final String ERR_03018 = "ERR_03018";
	public static final String ERR_03019 = "ERR_03019";
	public static final String ERR_03020 = "ERR_03020";
	public static final String ERR_03021 = "ERR_03021";
	public static final String ERR_03022 = "ERR_03022";
	public static final String ERR_03023 = "ERR_03023";
	public static final String ERR_03024 = "ERR_03024";
	public static final String ERR_03025 = "ERR_00025";
	public static final String ERR_03026 = "ERR_03026";
	public static final String ERR_03027 = "ERR_03027";
	public static final String ERR_03028 = "ERR_03028";
	public static final String ERR_03029 = "ERR_03029";
	public static final String ERR_03030 = "ERR_03030";
	public static final String ERR_03031 = "ERR_03031";
	public static final String ERR_03032 = "ERR_03032";
	public static final String ERR_03033 = "ERR_03033";
	public static final String ERR_03034 = "ERR_03034";
	public static final String ERR_03035 = "ERR_03035";
	public static final String ERR_03036 = "ERR_03036";
	public static final String ERR_03037 = "ERR_03037";
	public static final String ERR_03038 = "ERR_03038";
	public static final String ERR_03039 = "ERR_03039";
	public static final String ERR_03040 = "ERR_03040";

	// ldap
	public static final String ERR_04001 = "ERR_04001";
	public static final String ERR_04002 = "ERR_04002";
	public static final String ERR_04003 = "ERR_04003";
	public static final String ERR_04004 = "ERR_04004";
	public static final String ERR_04005 = "ERR_04005";
	public static final String ERR_04006 = "ERR_04006";
	public static final String ERR_04007 = "ERR_04007";
	public static final String ERR_04008 = "ERR_04008";
	public static final String ERR_04009 = "ERR_04009";
	public static final String ERR_04010 = "ERR_04010";
	public static final String ERR_04011 = "ERR_04011";
	public static final String ERR_04012 = "ERR_04012";
	public static final String ERR_04013 = "ERR_04013";
	public static final String ERR_04014 = "ERR_04014";
	public static final String ERR_04015 = "ERR_04015";
	public static final String ERR_04016 = "ERR_04016";
	public static final String ERR_04017 = "ERR_04017";
	public static final String ERR_04018 = "ERR_04018";
	public static final String ERR_04019 = "ERR_04019";
	public static final String ERR_04020 = "ERR_04020";
	public static final String ERR_04021 = "ERR_04021";
	public static final String ERR_04022 = "ERR_04022";
	public static final String ERR_04023 = "ERR_04023";
	public static final String ERR_04024 = "ERR_04024";
	public static final String ERR_04025 = "ERR_04025";
	public static final String ERR_04026 = "ERR_04026";
	public static final String ERR_04027 = "ERR_04027";
	public static final String ERR_04028 = "ERR_04028";
	public static final String ERR_04029 = "ERR_04029";
	public static final String ERR_04030 = "ERR_04030";
	public static final String ERR_04031 = "ERR_04031";
	public static final String ERR_04032 = "ERR_04032";
	public static final String ERR_04033 = "ERR_04033";
	public static final String ERR_04034 = "ERR_04034";
	public static final String ERR_04035 = "ERR_04035";
	public static final String ERR_04036 = "ERR_04036";
	public static final String ERR_04037 = "ERR_04037";
	public static final String ERR_04038 = "ERR_04038";
	public static final String ERR_04039 = "ERR_04039";
	public static final String ERR_04040 = "ERR_04040";
	public static final String ERR_04041 = "ERR_04041";
	public static final String ERR_04042 = "ERR_04042";
	public static final String ERR_04043 = "ERR_04043";
	public static final String ERR_04044 = "ERR_04044";
	public static final String ERR_04045 = "ERR_04045";
	public static final String ERR_04046 = "ERR_04046";
	public static final String ERR_04047 = "ERR_04047";
	public static final String ERR_04048 = "ERR_04048";
	public static final String ERR_04049 = "ERR_04049";
	public static final String ERR_04050 = "ERR_04050";
	public static final String ERR_04051 = "ERR_04051";
	public static final String ERR_04052 = "ERR_04052";
	public static final String ERR_04053 = "ERR_04053";
	public static final String ERR_04054 = "ERR_04054";
	public static final String ERR_04055 = "ERR_04055";
	public static final String ERR_04056 = "ERR_04056";
	public static final String ERR_04057 = "ERR_04057";
	public static final String ERR_04058 = "ERR_04058";
	public static final String ERR_04059 = "ERR_04059";
	public static final String ERR_04060 = "ERR_04060";
	public static final String ERR_04061 = "ERR_04061";
	public static final String ERR_04062 = "ERR_04062";
	public static final String ERR_04063 = "ERR_04063";
	public static final String ERR_04064 = "ERR_04064";
	public static final String ERR_04065 = "ERR_04065";
	public static final String ERR_04066 = "ERR_04066";
	public static final String ERR_04067 = "ERR_04067";
	public static final String ERR_04068 = "ERR_04068";
	public static final String ERR_04069 = "ERR_04069";
	public static final String ERR_04070 = "ERR_04070";
	public static final String ERR_04071 = "ERR_04071";
	public static final String ERR_04072 = "ERR_04072";
	public static final String ERR_04073 = "ERR_04073";
	public static final String ERR_04074 = "ERR_04074";
	public static final String ERR_04075 = "ERR_04075";
	public static final String ERR_04076 = "ERR_04076";
	public static final String ERR_04077 = "ERR_04077";
	public static final String ERR_04078 = "ERR_04078";
	public static final String ERR_04079 = "ERR_04079";
	public static final String ERR_04080 = "ERR_04080";
	public static final String ERR_04081 = "ERR_04081";
	public static final String ERR_04082 = "ERR_04082";
	public static final String ERR_04083 = "ERR_04083";
	public static final String ERR_04084 = "ERR_04084";
	public static final String ERR_04085 = "ERR_04085";
	public static final String ERR_04086 = "ERR_04086";
	public static final String ERR_04087 = "ERR_04087";
	public static final String ERR_04088 = "ERR_04088";
	public static final String ERR_04089 = "ERR_04089";
	public static final String ERR_04090 = "ERR_04090";
	public static final String ERR_04091 = "ERR_04091";
	public static final String ERR_04092 = "ERR_04092";
	public static final String ERR_04093 = "ERR_04093";
	public static final String ERR_04094 = "ERR_04094";
	public static final String ERR_04095 = "ERR_04095";
	public static final String ERR_04096 = "ERR_04096";
	public static final String ERR_04097 = "ERR_04097";
	public static final String ERR_04098 = "ERR_04098";
	public static final String ERR_04099 = "ERR_04099";
	public static final String ERR_04100 = "ERR_04100";
	public static final String ERR_04101 = "ERR_04101";
	public static final String ERR_04102 = "ERR_04102";
	public static final String ERR_04103 = "ERR_04103";
	public static final String ERR_04104 = "ERR_04104";
	public static final String ERR_04105 = "ERR_04105";
	public static final String ERR_04106 = "ERR_04106";
	public static final String ERR_04107 = "ERR_04107";
	public static final String ERR_04108 = "ERR_04108";
	public static final String ERR_04109 = "ERR_04109";
	public static final String ERR_04110 = "ERR_04110";
	public static final String ERR_04111 = "ERR_04111";
	public static final String ERR_04112 = "ERR_04112";
	public static final String ERR_04113 = "ERR_04113";
	public static final String ERR_04114 = "ERR_04114";
	public static final String ERR_04115 = "ERR_04115";
	public static final String ERR_04116 = "ERR_04116";
	public static final String ERR_04117 = "ERR_04117";
	public static final String ERR_04118 = "ERR_04118";
	public static final String ERR_04119 = "ERR_04119";
	public static final String ERR_04120 = "ERR_04120";
	public static final String ERR_04121 = "ERR_04121";
	public static final String ERR_04122 = "ERR_04122";
	public static final String ERR_04123 = "ERR_04123";
	public static final String ERR_04124 = "ERR_04124";
	public static final String ERR_04125 = "ERR_04125";
	public static final String ERR_04126 = "ERR_04126";
	public static final String ERR_04127 = "ERR_04127";
	public static final String ERR_04128 = "ERR_04128";
	public static final String ERR_04129 = "ERR_04129";
	public static final String ERR_04130 = "ERR_04130";
	public static final String ERR_04131 = "ERR_04131";
	public static final String ERR_04132 = "ERR_04132";
	public static final String ERR_04133 = "ERR_04133";
	public static final String ERR_04134 = "ERR_04134";
	public static final String ERR_04135 = "ERR_04135";
	public static final String ERR_04136 = "ERR_04136";
	public static final String ERR_04137 = "ERR_04137";
	public static final String ERR_04138 = "ERR_04138";
	public static final String ERR_04139 = "ERR_04139";
	public static final String ERR_04140 = "ERR_04140";
	public static final String ERR_04141 = "ERR_04141";
	public static final String ERR_04142 = "ERR_04142";
	public static final String ERR_04143 = "ERR_04143";
	public static final String ERR_04144 = "ERR_04144";
	public static final String ERR_04145 = "ERR_04145";
	public static final String ERR_04146 = "ERR_04146";
	public static final String ERR_04147 = "ERR_04147";
	public static final String ERR_04148 = "ERR_04148";
	public static final String ERR_04149 = "ERR_04149";
	public static final String ERR_04150 = "ERR_04150";
	public static final String ERR_04151 = "ERR_04151";
	public static final String ERR_04152 = "ERR_04152";
	public static final String ERR_04153 = "ERR_04153";
	public static final String ERR_04154 = "ERR_04154";
	public static final String ERR_04155 = "ERR_04155";
	public static final String ERR_04156 = "ERR_04156";
	public static final String ERR_04157 = "ERR_04157";
	public static final String ERR_04158 = "ERR_04158";
	public static final String ERR_04159 = "ERR_04159";
	public static final String ERR_04160 = "ERR_04160";
	public static final String ERR_04161 = "ERR_04161";
	public static final String ERR_04162 = "ERR_04162";
	public static final String ERR_04163 = "ERR_04163";
	public static final String ERR_04164 = "ERR_04164";
	public static final String ERR_04165 = "ERR_04165";
	public static final String ERR_04166 = "ERR_04166";
	public static final String ERR_04167 = "ERR_04167";
	public static final String ERR_04168 = "ERR_04168";
	public static final String ERR_04169 = "ERR_04169";
	public static final String ERR_04170 = "ERR_04170";
	public static final String ERR_04171 = "ERR_04171";
	public static final String ERR_04172 = "ERR_04172";
	public static final String ERR_04173 = "ERR_04173";
	public static final String ERR_04174 = "ERR_04174";
	public static final String ERR_04175 = "ERR_04175";
	public static final String ERR_04176 = "ERR_04176";
	public static final String ERR_04177 = "ERR_04177";
	public static final String ERR_04178 = "ERR_04178";
	public static final String ERR_04179 = "ERR_04179";
	public static final String ERR_04180 = "ERR_04180";
	public static final String ERR_04181 = "ERR_04181";
	public static final String ERR_04182 = "ERR_04182";
	public static final String ERR_04183 = "ERR_04183";
	public static final String ERR_04184 = "ERR_04184";
	public static final String ERR_04185 = "ERR_04185";
	public static final String ERR_04186 = "ERR_04186";
	public static final String ERR_04187 = "ERR_04187";
	public static final String ERR_04188 = "ERR_04188";
	public static final String ERR_04189 = "ERR_04189";
	public static final String ERR_04190 = "ERR_04190";
	public static final String ERR_04191 = "ERR_04191";
	public static final String ERR_04192 = "ERR_04192";
	public static final String ERR_04193 = "ERR_04193";
	public static final String ERR_04194 = "ERR_04194";
	public static final String ERR_04195 = "ERR_04195";
	public static final String ERR_04196 = "ERR_04196";
	public static final String ERR_04197 = "ERR_04197";
	public static final String ERR_04198 = "ERR_04198";
	public static final String ERR_04199 = "ERR_04199";
	public static final String ERR_04200 = "ERR_04200";
	public static final String ERR_04201 = "ERR_04201";
	public static final String ERR_04202 = "ERR_04202";
	public static final String ERR_04203 = "ERR_04203";
	public static final String ERR_04204 = "ERR_04204";
	public static final String ERR_04205 = "ERR_04205";
	public static final String ERR_04206 = "ERR_04206";
	public static final String ERR_04207 = "ERR_04207";
	public static final String ERR_04208 = "ERR_04208";
	public static final String ERR_04209 = "ERR_04209";
	public static final String ERR_04210 = "ERR_04210";
	public static final String ERR_04211 = "ERR_04211";
	public static final String ERR_04212 = "ERR_04212";
	public static final String ERR_04213 = "ERR_04213";
	public static final String ERR_04214 = "ERR_04214";
	public static final String ERR_04215 = "ERR_04215";
	public static final String ERR_04216 = "ERR_04216";
	public static final String ERR_04217 = "ERR_04217";
	public static final String ERR_04218 = "ERR_04218";
	public static final String ERR_04219 = "ERR_04219";
	public static final String ERR_04220 = "ERR_04220";
	public static final String ERR_04221 = "ERR_04221";
	public static final String ERR_04222 = "ERR_04222";
	public static final String ERR_04223 = "ERR_04223";
	public static final String ERR_04224 = "ERR_04224";
	public static final String ERR_04225 = "ERR_04225";
	public static final String ERR_04226 = "ERR_04226";
	public static final String ERR_04227 = "ERR_04227";
	public static final String ERR_04228 = "ERR_04228";
	public static final String ERR_04229 = "ERR_04229";
	public static final String ERR_04230 = "ERR_04230";
	public static final String ERR_04231 = "ERR_04231";
	public static final String ERR_04232 = "ERR_04232";
	public static final String ERR_04233 = "ERR_04233";
	public static final String ERR_04234 = "ERR_04234";
	public static final String ERR_04235 = "ERR_04235";
	public static final String ERR_04236 = "ERR_04236";
	public static final String ERR_04237 = "ERR_04237";
	public static final String ERR_04238 = "ERR_04238";
	public static final String ERR_04239 = "ERR_04239";
	public static final String ERR_04240 = "ERR_04240";
	public static final String ERR_04241 = "ERR_04241";
	public static final String ERR_04242 = "ERR_04242";
	public static final String ERR_04243 = "ERR_04243";
	public static final String ERR_04244 = "ERR_04244";
	public static final String ERR_04245 = "ERR_04245";
	public static final String ERR_04246 = "ERR_04246";
	public static final String ERR_04247 = "ERR_04247";
	public static final String ERR_04248 = "ERR_04248";
	public static final String ERR_04249 = "ERR_04249";
	public static final String ERR_04250 = "ERR_04250";
	public static final String ERR_04251 = "ERR_04251";
	public static final String ERR_04252 = "ERR_04252";
	public static final String ERR_04253 = "ERR_04253";
	public static final String ERR_04254 = "ERR_04254";
	public static final String ERR_04255 = "ERR_04255";
	public static final String ERR_04256 = "ERR_04256";
	public static final String ERR_04257 = "ERR_04257";
	public static final String ERR_04258 = "ERR_04258";
	public static final String ERR_04259 = "ERR_04259";
	public static final String ERR_04260 = "ERR_04260";
	public static final String ERR_04261 = "ERR_04261";
	public static final String ERR_04262 = "ERR_04262";
	public static final String ERR_04263 = "ERR_04263";
	public static final String ERR_04264 = "ERR_04264";
	public static final String ERR_04265 = "ERR_04265";
	public static final String ERR_04266 = "ERR_04266";
	public static final String ERR_04267 = "ERR_04267";
	public static final String ERR_04268 = "ERR_04268";
	public static final String ERR_04269 = "ERR_04269";
	public static final String ERR_04270 = "ERR_04270";
	public static final String ERR_04271 = "ERR_04271";
	public static final String ERR_04272 = "ERR_04272";
	public static final String ERR_04273 = "ERR_04273";
	public static final String ERR_04274 = "ERR_04274";
	public static final String ERR_04275 = "ERR_04275";
	public static final String ERR_04276 = "ERR_04276";
	public static final String ERR_04277 = "ERR_04277";
	public static final String ERR_04278 = "ERR_04278";
	public static final String ERR_04279 = "ERR_04279";
	public static final String ERR_04280 = "ERR_04280";
	public static final String ERR_04281 = "ERR_04281";
	public static final String ERR_04282 = "ERR_04282";
	public static final String ERR_04283 = "ERR_04283";
	public static final String ERR_04284 = "ERR_04284";
	public static final String ERR_04285 = "ERR_04285";
	public static final String ERR_04286 = "ERR_04286";
	public static final String ERR_04287 = "ERR_04287";
	public static final String ERR_04288 = "ERR_04288";
	public static final String ERR_04289 = "ERR_04289";
	public static final String ERR_04290 = "ERR_04290";
	public static final String ERR_04291 = "ERR_04291";
	public static final String ERR_04292 = "ERR_04292";
	public static final String ERR_04293 = "ERR_04293";
	public static final String ERR_04294 = "ERR_04294";
	public static final String ERR_04295 = "ERR_04295";
	public static final String ERR_04296 = "ERR_04296";
	public static final String ERR_04297 = "ERR_04297";
	public static final String ERR_04298 = "ERR_04298";
	public static final String ERR_04299 = "ERR_04299";
	public static final String ERR_04300 = "ERR_04300";
	public static final String ERR_04301 = "ERR_04301";
	public static final String ERR_04302 = "ERR_04302";
	public static final String ERR_04303 = "ERR_04303";
	public static final String ERR_04304 = "ERR_04304";
	public static final String ERR_04305 = "ERR_04305";
	public static final String ERR_04306 = "ERR_04306";
	public static final String ERR_04307 = "ERR_04307";
	public static final String ERR_04308 = "ERR_04308";
	public static final String ERR_04309 = "ERR_04309";
	public static final String ERR_04310 = "ERR_04310";
	public static final String ERR_04311 = "ERR_04311";
	public static final String ERR_04312 = "ERR_04312";
	public static final String ERR_04313 = "ERR_04313";
	public static final String ERR_04314 = "ERR_04314";
	public static final String ERR_04315 = "ERR_04315";
	public static final String ERR_04316 = "ERR_04316";
	public static final String ERR_04317 = "ERR_04317";
	public static final String ERR_04318 = "ERR_04318";
	public static final String ERR_04319 = "ERR_04319";
	public static final String ERR_04320 = "ERR_04320";
	public static final String ERR_04321 = "ERR_04321";
	public static final String ERR_04322 = "ERR_04322";
	public static final String ERR_04323 = "ERR_04323";
	public static final String ERR_04324 = "ERR_04324";
	public static final String ERR_04325 = "ERR_04325";
	public static final String ERR_04326 = "ERR_04326";
	public static final String ERR_04327 = "ERR_04327";
	public static final String ERR_04328 = "ERR_04328";
	public static final String ERR_04329 = "ERR_04329";
	public static final String ERR_04330 = "ERR_04330";
	public static final String ERR_04331 = "ERR_04331";
	public static final String ERR_04332 = "ERR_04332";
	public static final String ERR_04333 = "ERR_04333";
	public static final String ERR_04334 = "ERR_04334";
	public static final String ERR_04335 = "ERR_04335";
	public static final String ERR_04336 = "ERR_04336";
	public static final String ERR_04337 = "ERR_04337";
	public static final String ERR_04338 = "ERR_04338";
	public static final String ERR_04339 = "ERR_04339";
	public static final String ERR_04340 = "ERR_04340";
	public static final String ERR_04341 = "ERR_04341";
	public static final String ERR_04342 = "ERR_04342";
	public static final String ERR_04343 = "ERR_04343";
	public static final String ERR_04344 = "ERR_04344";
	public static final String ERR_04345 = "ERR_04345";
	public static final String ERR_04346 = "ERR_04346";
	public static final String ERR_04347 = "ERR_04347";
	public static final String ERR_04348 = "ERR_04348";
	public static final String ERR_04349 = "ERR_04349";
	public static final String ERR_04350 = "ERR_04350";
	public static final String ERR_04351 = "ERR_04351";
	public static final String ERR_04352 = "ERR_04352";
	public static final String ERR_04353 = "ERR_04353";
	public static final String ERR_04354 = "ERR_04354";
	public static final String ERR_04355 = "ERR_04355";
	public static final String ERR_04356 = "ERR_04356";
	public static final String ERR_04357 = "ERR_04357";
	public static final String ERR_04358 = "ERR_04358";
	public static final String ERR_04359 = "ERR_04359";
	public static final String ERR_04360 = "ERR_04360";
	public static final String ERR_04361 = "ERR_04361";
	public static final String ERR_04362 = "ERR_04362";
	public static final String ERR_04363 = "ERR_04363";
	public static final String ERR_04364 = "ERR_04364";
	public static final String ERR_04365 = "ERR_04365";
	public static final String ERR_04366 = "ERR_04366";
	public static final String ERR_04367 = "ERR_04367";
	public static final String ERR_04368 = "ERR_04368";
	public static final String ERR_04369 = "ERR_04369";
	public static final String ERR_04370 = "ERR_04370";
	public static final String ERR_04371 = "ERR_04371";
	public static final String ERR_04372 = "ERR_04372";
	public static final String ERR_04373 = "ERR_04373";
	public static final String ERR_04374 = "ERR_04374";
	public static final String ERR_04375 = "ERR_04375";
	public static final String ERR_04376 = "ERR_04376";
	public static final String ERR_04377 = "ERR_04377";
	public static final String ERR_04378 = "ERR_04378";
	public static final String ERR_04379 = "ERR_04379";
	public static final String ERR_04380 = "ERR_04380";
	public static final String ERR_04381 = "ERR_04381";
	public static final String ERR_04382 = "ERR_04382";
	public static final String ERR_04383 = "ERR_04383";
	public static final String ERR_04384 = "ERR_04384";
	public static final String ERR_04385 = "ERR_04385";
	public static final String ERR_04386 = "ERR_04386";
	public static final String ERR_04387 = "ERR_04387";
	public static final String ERR_04388 = "ERR_04388";
	public static final String ERR_04389 = "ERR_04389";
	public static final String ERR_04390 = "ERR_04390";
	public static final String ERR_04391 = "ERR_04391";
	public static final String ERR_04392 = "ERR_04392";
	public static final String ERR_04393 = "ERR_04393";
	public static final String ERR_04394 = "ERR_04394";
	public static final String ERR_04395 = "ERR_04395";
	public static final String ERR_04396 = "ERR_04396";
	public static final String ERR_04397 = "ERR_04397";
	public static final String ERR_04398 = "ERR_04398";
	public static final String ERR_04399 = "ERR_04399";
	public static final String ERR_04400 = "ERR_04400";
	public static final String ERR_04401 = "ERR_04401";
	public static final String ERR_04402 = "ERR_04402";
	public static final String ERR_04403 = "ERR_04403";
	public static final String ERR_04404 = "ERR_04404";
	public static final String ERR_04405 = "ERR_04405";
	public static final String ERR_04406 = "ERR_04406";
	public static final String ERR_04407 = "ERR_04407";
	public static final String ERR_04408 = "ERR_04408";
	public static final String ERR_04409 = "ERR_04409";
	public static final String ERR_04410 = "ERR_04410";
	public static final String ERR_04411 = "ERR_04411";
	public static final String ERR_04412 = "ERR_04412";
	public static final String ERR_04413 = "ERR_04413";
	public static final String ERR_04414 = "ERR_04414";
	public static final String ERR_04415 = "ERR_04415";
	public static final String ERR_04416 = "ERR_04416";
	public static final String ERR_04417 = "ERR_04417";
	public static final String ERR_04418 = "ERR_04418";
	public static final String ERR_04419 = "ERR_04419";
	public static final String ERR_04420 = "ERR_04420";
	public static final String ERR_04421 = "ERR_04421";
	public static final String ERR_04422 = "ERR_04422";
	public static final String ERR_04423 = "ERR_04423";
	public static final String ERR_04424 = "ERR_04424";
	public static final String ERR_04425 = "ERR_04425";
	public static final String ERR_04426 = "ERR_04426";
	public static final String ERR_04427 = "ERR_04427";
	public static final String ERR_04428 = "ERR_04428";
	public static final String ERR_04429 = "ERR_04429";
	public static final String ERR_04430 = "ERR_04430";
	public static final String ERR_04431 = "ERR_04431";
	public static final String ERR_04432 = "ERR_04432";
	public static final String ERR_04433 = "ERR_04433";
	public static final String ERR_04434 = "ERR_04434";
	public static final String ERR_04435 = "ERR_04435";
	public static final String ERR_04436 = "ERR_04436";
	public static final String ERR_04437 = "ERR_04437";
	public static final String ERR_04438 = "ERR_04438";
	public static final String ERR_04439 = "ERR_04439";
	public static final String ERR_04440 = "ERR_04440";
    public static final String ERR_04441 = "ERR_04441";
    public static final String ERR_04442_NULL_AT_NOT_ALLOWED = "ERR_04442_NULL_AT_NOT_ALLOWED";
    public static final String ERR_04443 = "ERR_04443";
    public static final String ERR_04444 = "ERR_04444";
    public static final String ERR_04445 = "ERR_04445";
    public static final String ERR_04446 = "ERR_04446";
    public static final String ERR_04447 = "ERR_04447";
    public static final String ERR_04448 = "ERR_04448";
    public static final String ERR_04449 = "ERR_04449";
    public static final String ERR_04450 = "ERR_04450";
    public static final String ERR_04451 = "ERR_04451";
    public static final String ERR_04452 = "ERR_04452";
    public static final String ERR_04453 = "ERR_04453";
    public static final String ERR_04454 = "ERR_04454";
    public static final String ERR_04455 = "ERR_04455";
    public static final String ERR_04456 = "ERR_04456";
    public static final String ERR_04457_NULL_ATTRIBUTE_ID = "ERR_04457_NULL_ATTRIBUTE_ID";
    public static final String ERR_04458 = "ERR_04458";
    public static final String ERR_04459 = "ERR_04459";
    public static final String ERR_04460_ATTRIBUTE_TYPE_NULL_NOT_ALLOWED = "ERR_04460_ATTRIBUTE_TYPE_NULL_NOT_ALLOWED";
    public static final String ERR_04461 = "ERR_04461";
    public static final String ERR_04462 = "ERR_04462";
    public static final String ERR_04463 = "ERR_04463";
    public static final String ERR_04464 = "ERR_04464";
    public static final String ERR_04465 = "ERR_04465";
    public static final String ERR_04466 = "ERR_04466";
    public static final String ERR_04467 = "ERR_04467";
    public static final String ERR_04468 = "ERR_04468";
    public static final String ERR_04469 = "ERR_04469";
    public static final String ERR_04470 = "ERR_04470";
    public static final String ERR_04471 = "ERR_04471";
    public static final String ERR_04472 = "ERR_04472";
    public static final String ERR_04473 = "ERR_04473";
    public static final String ERR_04474 = "ERR_04474";
    public static final String ERR_04475 = "ERR_04475";
    public static final String ERR_04476 = "ERR_04476";
    public static final String ERR_04477_NO_VALID_AT_FOR_THIS_ID = "ERR_04477_NO_VALID_AT_FOR_THIS_ID";
    public static final String ERR_04478_NO_VALUE_NOT_ALLOWED = "ERR_04478_NO_VALUE_NOT_ALLOWED";
    public static final String ERR_04479_INVALID_SYNTAX_VALUE = "ERR_04479_INVALID_SYNTAX_VALUE";

	// ldap-constants
	public static final String ERR_05001 = "ERR_05001";

	// ldap-converter
	public static final String ERR_06001 = "ERR_06001";
	public static final String ERR_06002 = "ERR_06002";
	public static final String ERR_06003 = "ERR_06003";
	public static final String ERR_06004 = "ERR_06004";
	public static final String ERR_06005 = "ERR_06005";
	public static final String ERR_06006 = "ERR_06006";

	// ldap-jndi
	// no exceptions to translate
	
	// ldap-schema
	public static final String ERR_08001 = "ERR_08001";
	public static final String ERR_08002 = "ERR_08002";
	public static final String ERR_08003 = "ERR_08003";
	public static final String ERR_08004 = "ERR_08004";
	public static final String ERR_08005 = "ERR_08005";
	public static final String ERR_08006 = "ERR_08006";
	
	// ldap-schema-dao
	// no exceptions to translate
	
	// ldap-schema-loader
	public static final String ERR_10001 = "ERR_10001";
	public static final String ERR_10002 = "ERR_10002";
	public static final String ERR_10003 = "ERR_10003";
	public static final String ERR_10004 = "ERR_10004";
	public static final String ERR_10005 = "ERR_10005";
	public static final String ERR_10006 = "ERR_10006";
	public static final String ERR_10007 = "ERR_10007";
	public static final String ERR_10008 = "ERR_10008";
	public static final String ERR_10009 = "ERR_10009";
	public static final String ERR_10010 = "ERR_10010";
	public static final String ERR_10011 = "ERR_10011";
	public static final String ERR_10012 = "ERR_10012";
	public static final String ERR_10013 = "ERR_10013";
	public static final String ERR_10014 = "ERR_10014";
	public static final String ERR_10015 = "ERR_10015";
	public static final String ERR_10016 = "ERR_10016";
	public static final String ERR_10017 = "ERR_10017";
	public static final String ERR_10018 = "ERR_10018";
	public static final String ERR_10019 = "ERR_10019";
	public static final String ERR_10020 = "ERR_10020";
	public static final String ERR_10021 = "ERR_10021";
	public static final String ERR_10022 = "ERR_10022";
	public static final String ERR_10023 = "ERR_10023";
	public static final String ERR_10024 = "ERR_10024";
	public static final String ERR_10025 = "ERR_10025";
	public static final String ERR_10026 = "ERR_10026";
	public static final String ERR_10027 = "ERR_10027";
	public static final String ERR_10028 = "ERR_10028";
	
	// ldap-schema-manager
	public static final String ERR_11001 = "ERR_11001";
	public static final String ERR_11002 = "ERR_11002";
	public static final String ERR_11003 = "ERR_11003";
	public static final String ERR_11004 = "ERR_11004";
	public static final String ERR_11005 = "ERR_11005";
	public static final String ERR_11006 = "ERR_11006";
	public static final String ERR_11007 = "ERR_11007";
	public static final String ERR_11008 = "ERR_11008";
	public static final String ERR_11009 = "ERR_11009";
	public static final String ERR_11010 = "ERR_11010";
	public static final String ERR_11011 = "ERR_11011";
	public static final String ERR_11012 = "ERR_11012";
	public static final String ERR_11013 = "ERR_11013";
	
	// ldap-schema-manager
	public static final String ERR_12001 = "ERR_12001";
	public static final String ERR_12002 = "ERR_12002";
	public static final String ERR_12003 = "ERR_12003";
	public static final String ERR_12004 = "ERR_12004";
	public static final String ERR_12005 = "ERR_12005";
	public static final String ERR_12006 = "ERR_12006";
	public static final String ERR_12007 = "ERR_12007";
	public static final String ERR_12008 = "ERR_12008";
	public static final String ERR_12009 = "ERR_12009";
	public static final String ERR_12010 = "ERR_12010";
	public static final String ERR_12011 = "ERR_12011";
	public static final String ERR_12012 = "ERR_12012";
	public static final String ERR_12013 = "ERR_12013";
	public static final String ERR_12014 = "ERR_12014";
	public static final String ERR_12015 = "ERR_12015";
	public static final String ERR_12016 = "ERR_12016";
	public static final String ERR_12017 = "ERR_12017";
	public static final String ERR_12018 = "ERR_12018";
	public static final String ERR_12019 = "ERR_12019";
	public static final String ERR_12020 = "ERR_12020";
	public static final String ERR_12021 = "ERR_12021";
	public static final String ERR_12022 = "ERR_12022";
	public static final String ERR_12023 = "ERR_12023";
	public static final String ERR_12024 = "ERR_12024";
	public static final String ERR_12025 = "ERR_12025";
	public static final String ERR_12026 = "ERR_12026";
	public static final String ERR_12027 = "ERR_12027";
	public static final String ERR_12028 = "ERR_12028";
	public static final String ERR_12029 = "ERR_12029";
	public static final String ERR_12030 = "ERR_12030";
	public static final String ERR_12031 = "ERR_12031";
	public static final String ERR_12032 = "ERR_12032";
	public static final String ERR_12033 = "ERR_12033";
	public static final String ERR_12034 = "ERR_12034";
	public static final String ERR_12035 = "ERR_12035";
	public static final String ERR_12036 = "ERR_12036";
	public static final String ERR_12037 = "ERR_12037";
	public static final String ERR_12038 = "ERR_12038";
	public static final String ERR_12039 = "ERR_12039";
	public static final String ERR_12040 = "ERR_12040";
	public static final String ERR_12041 = "ERR_12041";
	public static final String ERR_12042 = "ERR_12042";
	public static final String ERR_12043 = "ERR_12043";
	public static final String ERR_12044 = "ERR_12044";
	public static final String ERR_12045 = "ERR_12045";
	public static final String ERR_12046 = "ERR_12046";
	public static final String ERR_12047 = "ERR_12047";
	public static final String ERR_12048 = "ERR_12048";
	public static final String ERR_12049 = "ERR_12049";
	public static final String ERR_12050 = "ERR_12050";
	public static final String ERR_12051 = "ERR_12051";
	public static final String ERR_12052 = "ERR_12052";
	public static final String ERR_12053 = "ERR_12053";
	public static final String ERR_12054 = "ERR_12054";
	public static final String ERR_12055 = "ERR_12055";
	public static final String ERR_12056 = "ERR_12056";
	public static final String ERR_12057 = "ERR_12057";
	public static final String ERR_12058 = "ERR_12058";
	public static final String ERR_12059 = "ERR_12059";
	public static final String ERR_12060 = "ERR_12060";
	public static final String ERR_12061 = "ERR_12061";
	public static final String ERR_12062 = "ERR_12062";
	public static final String ERR_12063 = "ERR_12063";
	public static final String ERR_12064 = "ERR_12064";
	public static final String ERR_12065 = "ERR_12065";
	public static final String ERR_12066 = "ERR_12066";
	public static final String ERR_12067 = "ERR_12067";
	public static final String ERR_12068 = "ERR_12068";
	public static final String ERR_12069 = "ERR_12069";
	public static final String ERR_12070 = "ERR_12070";
	public static final String ERR_12071 = "ERR_12071";
	public static final String ERR_12072 = "ERR_12072";
	public static final String ERR_12073 = "ERR_12073";
	public static final String ERR_12074 = "ERR_12074";
	public static final String ERR_12075 = "ERR_12075";
	public static final String ERR_12076 = "ERR_12076";
	public static final String ERR_12077 = "ERR_12077";
	public static final String ERR_12078 = "ERR_12078";
	public static final String ERR_12079 = "ERR_12079";
	public static final String ERR_12080 = "ERR_12080";
	public static final String ERR_12081 = "ERR_12081";
	public static final String ERR_12082 = "ERR_12082";
	public static final String ERR_12083 = "ERR_12083";
	public static final String ERR_12084 = "ERR_12084";
	public static final String ERR_12085 = "ERR_12085";
	public static final String ERR_12086 = "ERR_12086";
	public static final String ERR_12087 = "ERR_12087";
	
    /**
     * 
     * Translate an error code with argument(s)
     *
     * @param err The error code
     * @param args The argument(s)
     * @return
     */
    public static String err( String err, Object... args )
    {
        try
        {
            return err + " " + MessageFormat.format( errBundle.getString( err ), args );
        }
        catch ( Exception e )
        {
            StringBuffer sb = new StringBuffer();
            boolean comma = false;
            for ( Object obj : args )
            {
                if ( comma )
                {
                    sb.append( "," );
                }
                else
                {
                    comma = true;
                }
                sb.append( obj );
            }
            return err + " (" + sb.toString() + ")";
        }
    }


    /**
     * 
     * Translate a message with argument(s)
     *
     * @param msg The message
     * @param args The argument(s)
     * @return
     */
    public static String msg( String msg, Object... args )
    {
        try
        {
            return MessageFormat.format( msgBundle.getString( msg ), args );
        }
        catch ( MissingResourceException mre )
        {
            try
            {
                return MessageFormat.format( msg, args );
            }
            catch ( Exception e )
            {
                StringBuffer sb = new StringBuffer();
                boolean comma = false;
                for ( Object obj : args )
                {
                    if ( comma )
                    {
                        sb.append( "," );
                    }
                    else
                    {
                        comma = true;
                    }
                    sb.append( obj );
                }
                return msg + " (" + sb.toString() + ")";
            }
        }
    }

}