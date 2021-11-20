package com.ai.openbilling.cdr.domain;

import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * UsageSpecification reference. UsageSpecification is a detailed description of a usage event that are of interest to the business and can have charges applied to it. It is comprised of characteristics, which define all attributes known for a particular type of usage.
 **/

/**
 * UsageSpecification reference. UsageSpecification is a detailed description of a usage event that are of interest to the business and can have charges applied to it. It is comprised of characteristics, which define all attributes known for a particular type of usage.
 */
@ApiModel(description = "UsageSpecification reference. UsageSpecification is a detailed description of a usage event that are of interest to the business and can have charges applied to it. It is comprised of characteristics, which define all attributes known for a particular type of usage.")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2021-11-18T11:36:14.505+08:00")

public class UsageSpecificationRef   {
  private String id = null;

  private String href = null;

  private String name = null;

  private String baseType = null;

  private String schemaLocation = null;

  private String type = null;

  private String referredType = null;

  public UsageSpecificationRef id(String id) {
    this.id = id;
    return this;
  }

   /**
   * unique identifier
   * @return id
  **/
  @ApiModelProperty(required = true, value = "unique identifier")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UsageSpecificationRef href(String href) {
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

  public UsageSpecificationRef name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the usage specification
   * @return name
  **/
  @ApiModelProperty(value = "The name of the usage specification")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UsageSpecificationRef baseType(String baseType) {
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

  public UsageSpecificationRef schemaLocation(String schemaLocation) {
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

  public UsageSpecificationRef type(String type) {
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

  public UsageSpecificationRef referredType(String referredType) {
    this.referredType = referredType;
    return this;
  }

   /**
   * The actual type of the target instance when needed for disambiguation.
   * @return referredType
  **/
  @ApiModelProperty(value = "The actual type of the target instance when needed for disambiguation.")
  public String getReferredType() {
    return referredType;
  }

  public void setReferredType(String referredType) {
    this.referredType = referredType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageSpecificationRef usageSpecificationRef = (UsageSpecificationRef) o;
    return Objects.equals(this.id, usageSpecificationRef.id) &&
        Objects.equals(this.href, usageSpecificationRef.href) &&
        Objects.equals(this.name, usageSpecificationRef.name) &&
        Objects.equals(this.baseType, usageSpecificationRef.baseType) &&
        Objects.equals(this.schemaLocation, usageSpecificationRef.schemaLocation) &&
        Objects.equals(this.type, usageSpecificationRef.type) &&
        Objects.equals(this.referredType, usageSpecificationRef.referredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, name, baseType, schemaLocation, type, referredType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageSpecificationRef {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    referredType: ").append(toIndentedString(referredType)).append("\n");
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

