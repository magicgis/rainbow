/*
 * Copyright (c) 2013, Rainbow and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software;Designed and Developed mainly by many Chinese 
 * opensource volunteers. you can redistribute it and/or modify it under the 
 * terms of the GNU General Public License version 2 only, as published by the
 * Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 * 
 * Any questions about this component can be directed to it's project Web address 
 * http://code.taobao.org/svn/rainbow/trunk
 *
 */
package org.hx.rainbow.common.security.rsa;

public interface RainbowSecurity {
	/**
	 * 加密
	 * @param securityCode 验证码
	 * @param modulus 密钥的modulus值
	 * @param privateExponent 私钥的Exponent值
	 * @return
	 */
	public abstract String encrypt(String securityCode,String modulus,String privateExponent);
	
	/**
	 * 解密
	 * @param modulus 密钥modulus值
     * @param privateExponent 私钥的Exponent值
	 * @param securityCode 验证码
	 * @return
	 */
	public abstract String decrypt(String securityCode,String modulus,String publicExponent);
}