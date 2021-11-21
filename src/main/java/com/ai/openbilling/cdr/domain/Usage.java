package com.ai.openbilling.cdr.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import org.joda.time.DateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * An occurrence of employing a Product, Service, or Resource for its intended purpose, which is of interest to the business and can have charges applied to it. It is comprised of characteristics, which represent attributes of usage.
 **/

/**
 * An occurrence of employing a Product, Service, or Resource for its intended purpose, which is of interest to the business and can have charges applied to it. It is comprised of characteristics, which represent attributes of usage.
 */
@ApiModel(description = "An occurrence of employing a Product, Service, or Resource for its intended purpose, which is of interest to the business and can have charges applied to it. It is comprised of characteristics, which represent attributes of usage.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2021-11-18T11:36:14.505+08:00")

public class Usage   {
  private String id = null;

  private String href = null;

  private String description = null;

  private Date usageDate = null;

  private String usageType = null;

  private List<RatedProductUsage> ratedProductUsage = new ArrayList<RatedProductUsage>();

  private List<RelatedParty> relatedParty = new ArrayList<RelatedParty>();

  private UsageStatusType status = null;

  private List<UsageCharacteristic> usageCharacteristic = new ArrayList<UsageCharacteristic>();

  private UsageSpecificationRef usageSpecification = null;

  private String baseType = null;

  private String schemaLocation = null;

  private String type = null;

  public Usage id(String id) {
    this.id = id;
    return this;
  }

   /**
   * unique identifier
   * @return id
  **/
  @ApiModelProperty(value = "unique identifier")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Usage href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Hyperlink reference
   * @return href
  **/
  @ApiModelProperty(value = "Hyperlink reference")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public Usage description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of usage
   * @return description
  **/
  @ApiModelProperty(example = "Voicemail Retrieval", value = "Description of usage")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Usage usageDate(Date usageDate) {
    this.usageDate = usageDate;
    return this;
  }

   /**
   * Date of usage
   * @return usageDate
  **/
  @ApiModelProperty(example = "2020-09-21T09:13:16-07:00", value = "Date of usage")
  public Date getUsageDate() {
    return usageDate;
  }

  public void setUsageDate(Date usageDate) {
    this.usageDate = usageDate;
  }

  public Usage usageType(String usageType) {
    this.usageType = usageType;
    return this;
  }

   /**
   * Type of usage
   * @return usageType
  **/
  @ApiModelProperty(value = "Type of usage")
  public String getUsageType() {
    return usageType;
  }

  public void setUsageType(String usageType) {
    this.usageType = usageType;
  }

  public Usage ratedProductUsage(List<RatedProductUsage> ratedProductUsage) {
    this.ratedProductUsage = ratedProductUsage;
    return this;
  }

  public Usage addRatedProductUsageItem(RatedProductUsage ratedProductUsageItem) {
    this.ratedProductUsage.add(ratedProductUsageItem);
    return this;
  }

   /**
   * Get ratedProductUsage
   * @return ratedProductUsage
  **/
  @ApiModelProperty(value = "")
  public List<RatedProductUsage> getRatedProductUsage() {
    return ratedProductUsage;
  }

  public void setRatedProductUsage(List<RatedProductUsage> ratedProductUsage) {
    this.ratedProductUsage = ratedProductUsage;
  }

  public Usage relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public Usage addRelatedPartyItem(RelatedParty relatedPartyItem) {
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

   /**
   * Get relatedParty
   * @return relatedParty
  **/
  @ApiModelProperty(value = "")
  public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public Usage status(UsageStatusType status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public UsageStatusType getStatus() {
    return status;
  }

  public void setStatus(UsageStatusType status) {
    this.status = status;
  }

  public Usage usageCharacteristic(List<UsageCharacteristic> usageCharacteristic) {
    this.usageCharacteristic = usageCharacteristic;
    return this;
  }

  public Usage addUsageCharacteristicItem(UsageCharacteristic usageCharacteristicItem) {
    this.usageCharacteristic.add(usageCharacteristicItem);
    return this;
  }

   /**
   * Get usageCharacteristic
   * @return usageCharacteristic
  **/
  @ApiModelProperty(value = "")
  public List<UsageCharacteristic> getUsageCharacteristic() {
    return usageCharacteristic;
  }

  public void setUsageCharacteristic(List<UsageCharacteristic> usageCharacteristic) {
    this.usageCharacteristic = usageCharacteristic;
  }

  public Usage usageSpecification(UsageSpecificationRef usageSpecification) {
    this.usageSpecification = usageSpecification;
    return this;
  }

   /**
   * Get usageSpecification
   * @return usageSpecification
  **/
  @ApiModelProperty(value = "")
  public UsageSpecificationRef getUsageSpecification() {
    return usageSpecification;
  }

  public void setUsageSpecification(UsageSpecificationRef usageSpecification) {
    this.usageSpecification = usageSpecification;
  }

  public Usage baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

   /**
   * When sub-classing, this defines the super-class
   * @return baseType
  **/
  @ApiModelProperty(value = "When sub-classing, this defines the super-class")
  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public Usage schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

   /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return schemaLocation
  **/
  @ApiModelProperty(value = "A URI to a JSON-Schema file that defines additional attributes and relationships")
  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public Usage type(String type) {
    this.type = type;
    return this;
  }

   /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return type
  **/
  @ApiModelProperty(value = "When sub-classing, this defines the sub-class Extensible name")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Usage usage = (Usage) o;
    return Objects.equals(this.id, usage.id) &&
        Objects.equals(this.href, usage.href) &&
        Objects.equals(this.description, usage.description) &&
        Objects.equals(this.usageDate, usage.usageDate) &&
        Objects.equals(this.usageType, usage.usageType) &&
        Objects.equals(this.ratedProductUsage, usage.ratedProductUsage) &&
        Objects.equals(this.relatedParty, usage.relatedParty) &&
        Objects.equals(this.status, usage.status) &&
        Objects.equals(this.usageCharacteristic, usage.usageCharacteristic) &&
        Objects.equals(this.usageSpecification, usage.usageSpecification) &&
        Objects.equals(this.baseType, usage.baseType) &&
        Objects.equals(this.schemaLocation, usage.schemaLocation) &&
        Objects.equals(this.type, usage.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, description, usageDate, usageType, ratedProductUsage, relatedParty, status, usageCharacteristic, usageSpecification, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Usage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    usageDate: ").append(toIndentedString(usageDate)).append("\n");
    sb.append("    usageType: ").append(toIndentedString(usageType)).append("\n");
    sb.append("    ratedProductUsage: ").append(toIndentedString(ratedProductUsage)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    usageCharacteristic: ").append(toIndentedString(usageCharacteristic)).append("\n");
    sb.append("    usageSpecification: ").append(toIndentedString(usageSpecification)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

