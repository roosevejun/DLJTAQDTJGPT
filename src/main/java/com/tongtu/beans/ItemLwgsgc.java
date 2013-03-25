
package com.tongtu.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.*;

/**
 * 项目名称：
 * 功能描述：
 * 创建人:倪少君
 * 创建时间: 13-3-4下午2:53
 * 修改人：
 * 修改时间:
 *
 * @版本：
 */

@Entity
@Table(name = "table_lwgsgc" )
public class ItemLwgsgc implements Serializable {


    protected String crowid;

    protected String xxblxdm;
    protected String xxblxhy;
    protected String xmlxdm;
    protected String xmlx;
    protected BigDecimal jslc;
    protected BigDecimal gslc;
    protected BigDecimal yjlc;
    protected BigDecimal ejlc;
    protected BigDecimal snjlc;
    protected BigDecimal sijlc;
    protected BigDecimal dwlc;
    protected BigDecimal lqlm;
    protected BigDecimal snlm;
    protected BigDecimal jypzlm;
    protected BigDecimal qtyhlm;
    protected BigDecimal wpzlm;
    protected BigInteger xzkyzsl;
    protected BigInteger dkgzsl;
    protected BigDecimal dgqcd;
    protected BigInteger qlzs;
    protected BigDecimal qlcd;
    protected BigInteger sdzs;
    protected BigDecimal sdcd;
    protected String jhnf;
    protected BigDecimal ndjhze;
    protected BigDecimal ndjhcgstz;
    protected BigDecimal ndjhdftz;
    protected String tbdwdm;
    protected String tbdwmc;
    protected String bz;

    /**
     * 获取crowid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Id
    @Column(name = "crowid", nullable = false, insertable = true, updatable = true, length = 36, precision = 36)
    public String getCROWID() {
        return crowid;
    }

    /**
     * 设置crowid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCROWID(String value) {
        this.crowid = value;
    }

    /**
     * 获取xxblxdm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "xxblxdm", nullable = false, insertable = true, updatable = true, length = 2, precision = 2)
    @Basic
    public String getXXBLXDM() {
        return xxblxdm;
    }

    /**
     * 设置xxblxdm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXXBLXDM(String value) {
        this.xxblxdm = value;
    }

    /**
     * 获取xxblxhy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "xxblxdmhy", nullable = false, insertable = true, updatable = true, length = 50, precision = 50)
    @Basic
    public String getXXBLXHY() {
        return xxblxhy;
    }

    /**
     * 设置xxblxhy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXXBLXHY(String value) {
        this.xxblxhy = value;
    }

    /**
     * 获取xmlxdm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "xmlxdm", nullable = false, insertable = true, updatable = true, length = 2, precision = 2)
    @Basic
    public String getXMLXDM() {
        return xmlxdm;
    }

    /**
     * 设置xmlxdm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMLXDM(String value) {
        this.xmlxdm = value;
    }

    /**
     * 获取xmlx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "xmlx", nullable = false, insertable = true, updatable = true, length = 50, precision = 50)
    @Basic
    public String getXMLX() {
        return xmlx;
    }

    /**
     * 设置xmlx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMLX(String value) {
        this.xmlx = value;
    }

    /**
     * 获取jslc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigDecimal }
     *     
     */
    @Column(name = "jslc", nullable = true, insertable = true, updatable = true, length = 7, precision = 7, scale = 3)
    @Basic
    public BigDecimal getJSLC() {
        return jslc;
    }

    /**
     * 设置jslc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public void setJSLC(BigDecimal value) {
        this.jslc = value;
    }

    /**
     * 获取gslc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigDecimal }
     *     
     */
    @Column(name = "gslc", nullable = true, insertable = true, updatable = true, length = 7,precision = 7, scale = 3)
    @Basic
    public BigDecimal getGSLC() {
        return gslc;
    }

    /**
     * 设置gslc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public void setGSLC(BigDecimal value) {
        this.gslc = value;
    }

    /**
     * 获取yjlc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigDecimal }
     *     
     */
    @Column(name = "yjlc", nullable = true, insertable = true, updatable = true, length = 7, precision = 7, scale = 3)
    @Basic
    public BigDecimal getYJLC() {
        return yjlc;
    }

    /**
     * 设置yjlc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public void setYJLC(BigDecimal value) {
        this.yjlc = value;
    }

    /**
     * 获取ejlc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigDecimal }
     *     
     */
    @Column(name = "ejlc", nullable = true, insertable = true, updatable = true, length = 7, precision = 7, scale = 3)
    @Basic
    public BigDecimal getEJLC() {
        return ejlc;
    }

    /**
     * 设置ejlc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public void setEJLC(BigDecimal value) {
        this.ejlc = value;
    }

    /**
     * 获取snjlc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigDecimal }
     *     
     */
    @Column(name = "snjlc", nullable = true, insertable = true, updatable = true, length = 7, precision = 7, scale = 3)
    @Basic
    public BigDecimal getSNJLC() {
        return snjlc;
    }

    /**
     * 设置snjlc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public void setSNJLC(BigDecimal value) {
        this.snjlc = value;
    }

    /**
     * 获取sijlc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigDecimal }
     *     
     */
    @Column(name = "sijlc", nullable = true, insertable = true, updatable = true, length = 7, precision = 7, scale = 3)
    @Basic
    public BigDecimal getSIJLC() {
        return sijlc;
    }

    /**
     * 设置sijlc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public void setSIJLC(BigDecimal value) {
        this.sijlc = value;
    }

    /**
     * 获取dwlc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigDecimal }
     *     
     */
    @Column(name = "dwlc", nullable = true, insertable = true, updatable = true, length = 7, precision = 7, scale = 3)
    @Basic
    public BigDecimal getDWLC() {
        return dwlc;
    }

    /**
     * 设置dwlc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public void setDWLC(BigDecimal value) {
        this.dwlc = value;
    }

    /**
     * 获取lqlm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigDecimal }
     *     
     */
    @Column(name = "lqlm", nullable = true, insertable = true, updatable = true, length = 7, precision = 7, scale = 3)
    @Basic
    public BigDecimal getLQLM() {
        return lqlm;
    }

    /**
     * 设置lqlm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public void setLQLM(BigDecimal value) {
        this.lqlm = value;
    }

    /**
     * 获取snlm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigDecimal }
     *     
     */
    @Column(name = "snlm", nullable = true, insertable = true, updatable = true, length = 7,precision = 7, scale = 3)
    @Basic
    public BigDecimal getSNLM() {
        return snlm;
    }

    /**
     * 设置snlm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public void setSNLM(BigDecimal value) {
        this.snlm = value;
    }

    /**
     * 获取jypzlm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigDecimal }
     *     
     */
    @Column(name = "jypzlm", nullable = true, insertable = true, updatable = true, length = 7, precision = 7, scale = 3)
    @Basic
    public BigDecimal getJYPZLM() {
        return jypzlm;
    }

    /**
     * 设置jypzlm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public void setJYPZLM(BigDecimal value) {
        this.jypzlm = value;
    }

    /**
     * 获取qtyhlm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigDecimal }
     *     
     */
    @Column(name = "qtyhlm", nullable = true, insertable = true, updatable = true, length = 7, precision = 7, scale = 3)
    @Basic
    public BigDecimal getQTYHLM() {
        return qtyhlm;
    }

    /**
     * 设置qtyhlm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public void setQTYHLM(BigDecimal value) {
        this.qtyhlm = value;
    }

    /**
     * 获取wpzlm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigDecimal }
     *     
     */
    @Column(name = "wpzlm", nullable = true, insertable = true, updatable = true, length = 7, precision = 7, scale = 3)
    @Basic
    public BigDecimal getWPZLM() {
        return wpzlm;
    }

    /**
     * 设置wpzlm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public void setWPZLM(BigDecimal value) {
        this.wpzlm = value;
    }

    /**
     * 获取xzkyzsl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigInteger }
     *     
     */
    @Column(name = "xzkyzsl", nullable = true, insertable = true, updatable = true,precision=18, scale=0)
    @Basic
    public BigInteger getXZKYZSL() {
        return xzkyzsl;
    }

    /**
     * 设置xzkyzsl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigInteger }
     *     
     */
    public void setXZKYZSL(BigInteger value) {
        this.xzkyzsl = value;
    }

    /**
     * 获取dkgzsl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigInteger }
     *     
     */
    @Column(name = "dkgzsl", nullable = true, insertable = true, updatable = true,precision=18, scale=0)
    @Basic
    public BigInteger getDKGZSL() {
        return dkgzsl;
    }

    /**
     * 设置dkgzsl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigInteger }
     *     
     */
    public void setDKGZSL(BigInteger value) {
        this.dkgzsl = value;
    }

    /**
     * 获取dgqcd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigDecimal }
     *     
     */
    @Column(name = "dgqcd", nullable = true, insertable = true, updatable = true, length = 8,precision = 8, scale = 1)
    @Basic
    public BigDecimal getDGQCD() {
        return dgqcd;
    }

    /**
     * 设置dgqcd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public void setDGQCD(BigDecimal value) {
        this.dgqcd = value;
    }

    /**
     * 获取qlzs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigInteger }
     *     
     */
    @Column(name = "qlzs", nullable = true, insertable = true, updatable = true,precision=18, scale=0)
    @Basic
    public BigInteger getQLZS() {
        return qlzs;
    }

    /**
     * 设置qlzs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigInteger }
     *     
     */
    public void setQLZS(BigInteger value) {
        this.qlzs = value;
    }

    /**
     * 获取qlcd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigDecimal }
     *     
     */
    @Column(name = "qlcd", nullable = true, insertable = true, updatable = true, length = 8, precision = 8, scale = 1)
    @Basic
    public BigDecimal getQLCD() {
        return qlcd;
    }

    /**
     * 设置qlcd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public void setQLCD(BigDecimal value) {
        this.qlcd = value;
    }

    /**
     * 获取sdzs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigInteger }
     *     
     */
    @Column(name = "sdzs", nullable = true, insertable = true, updatable = true,precision=18, scale=0)
    @Basic
    public BigInteger getSDZS() {
        return sdzs;
    }

    /**
     * 设置sdzs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigInteger }
     *     
     */
    public void setSDZS(BigInteger value) {
        this.sdzs = value;
    }

    /**
     * 获取sdcd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigDecimal }
     *     
     */
    @Column(name = "sdcd", nullable = true, insertable = true, updatable = true, length = 8,precision = 8, scale = 1)
    @Basic
    public BigDecimal getSDCD() {
        return sdcd;
    }

    /**
     * 设置sdcd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public void setSDCD(BigDecimal value) {
        this.sdcd = value;
    }

    /**
     * 获取jhnf属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "jhnf", nullable = false, insertable = true, updatable = true, length = 4, precision = 4)
    @Basic
    public String getJHNF() {
        return jhnf;
    }

    /**
     * 设置jhnf属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJHNF(String value) {
        this.jhnf = value;
    }

    /**
     * 获取ndjhze属性的值。
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigDecimal }
     *     
     */
    @Column(name = "ndjhze", nullable = true, insertable = true, updatable = true, length = 12,precision = 12, scale = 4)
    @Basic
    public BigDecimal getNDJHZE() {
        return ndjhze;
    }

    /**
     * 设置ndjhze属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public void setNDJHZE(BigDecimal value) {
        this.ndjhze = value;
    }

    /**
     * 获取ndjhcgstz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigDecimal }
     *     
     */
    @Column(name = "ndjhcgstz", nullable = true, insertable = true, updatable = true, length = 12, precision = 12, scale = 4)
    @Basic
    public BigDecimal getNDJHCGSTZ() {
        return ndjhcgstz;
    }

    /**
     * 设置ndjhcgstz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public void setNDJHCGSTZ(BigDecimal value) {
        this.ndjhcgstz = value;
    }

    /**
     * 获取ndjhdftz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigDecimal }
     *     
     */
    @Column(name = "ndjhdftz", nullable = true, insertable = true, updatable = true, length = 12,precision = 12, scale = 4)
    @Basic
    public BigDecimal getNDJHDFTZ() {
        return ndjhdftz;
    }

    /**
     * 设置ndjhdftz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigDecimal }
     *     
     */
    public void setNDJHDFTZ(BigDecimal value) {
        this.ndjhdftz = value;
    }

    /**
     * 获取tbdwdm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "tbdwdm", nullable = true, insertable = true, updatable = true,  length = 9,precision = 9)
    @Basic
    public String getTBDWDM() {
        return tbdwdm;
    }

    /**
     * 设置tbdwdm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTBDWDM(String value) {
        this.tbdwdm = value;
    }

    /**
     * 获取tbdwmc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "tbdwmc", nullable = true, insertable = true, updatable = true,  length = 100,precision = 100)
    @Basic
    public String getTBDWMC() {
        return tbdwmc;
    }

    /**
     * 设置tbdwmc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTBDWMC(String value) {
        this.tbdwmc = value;
    }

    /**
     * 获取bz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Column(name = "bz", nullable = true, insertable = true, updatable = true,  length = 500,precision = 500)
    @Basic
    public String getBZ() {
        return bz;
    }

    /**
     * 设置bz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBZ(String value) {
        this.bz = value;
    }

}
