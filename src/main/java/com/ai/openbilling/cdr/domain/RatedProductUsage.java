package com.ai.openbilling.cdr.domain;

import java.util.Date;
import java.util.Objects;

import org.joda.time.DateTime;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * An occurrence of employing a product for its intended purpose with all rating details
 **/

/**
 * An occurrence of employing a product for its intended purpose with all rating details
 */
@ApiModel(description = "An occurrence of employing a product for its intended purpose with all rating details")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2021-11-18T11:36:14.505+08:00")

public class RatedProductUsage   {
  private Boolean isBilled = null;

  private Boolean isTaxExempt = null;

  private String offerTariffType = null;

  private String ratingAmountType = null;

  private Date ratingDate = null;

  private Float taxRate = null;

  private String usageRatingTag = null;

  private Money bucketValueConvertedInAmount = null;

  private ProductRef productRef = null;

  private Money taxExcludedRatingAmount = null;

  private Money taxIncludedRatingAmount = null;

  private String baseType = null;

  private String schemaLocation = null;

  private String type = null;

  public RatedProductUsage isBilled(Boolean isBilled) {
    this.isBilled = isBilled;
    return this;
  }

   /**
   * Boolean indicating if usage have been billed or not
   * @return isBilled
  **/
  @ApiModelProperty(value = "Boolean indicating if usage have been billed or not")
  public Boolean getIsBilled() {
    return isBilled;
  }

  public void setIsBilled(Boolean isBilled) {
    this.isBilled = isBilled;
  }

  public RatedProductUsage isTaxExempt(Boolean isTaxExempt) {
    this.isTaxExempt = isTaxExempt;
    return this;
  }

   /**
   * Indicates if the rated amount is exempt of tax
   * @return isTaxExempt
  **/
  @ApiModelProperty(value = "Indicates if the rated amount is exempt of tax")
  public Boolean getIsTaxExempt() {
    return isTaxExempt;
  }

  public void setIsTaxExempt(Boolean isTaxExempt) {
    this.isTaxExempt = isTaxExempt;
  }

  public RatedProductUsage offerTariffType(String offerTariffType) {
    this.offerTariffType = offerTariffType;
    return this;
  }

   /**
   * Type of tariff applied
   * @return offerTariffType
  **/
  @ApiModelProperty(value = "Type of tariff applied")
  public String getOfferTariffType() {
    return offerTariffType;
  }

  public void setOfferTariffType(String offerTariffType) {
    this.offerTariffType = offerTariffType;
  }

  public RatedProductUsage ratingAmountType(String ratingAmountType) {
    this.ratingAmountType = ratingAmountType;
    return this;
  }

   /**
   * Type of amount
   * @return ratingAmountType
  **/
  @ApiModelProperty(value = "Type of amount")
  public String getRatingAmountType() {
    return ratingAmountType;
  }

  public void setRatingAmountType(String ratingAmountType) {
    this.ratingAmountType = ratingAmountType;
  }

  public RatedProductUsage ratingDate(Date ratingDate) {
    this.ratingDate = ratingDate;
    return this;
  }

   /**
   * Date of usage rating
   * @return ratingDate
  **/
  @ApiModelProperty(value = "Date of usage rating")
  public Date getRatingDate() {
    return ratingDate;
  }

  public void setRatingDate(Date ratingDate) {
    this.ratingDate = ratingDate;
  }

  public RatedProductUsage taxRate(Float taxRate) {
    this.taxRate = taxRate;
    return this;
  }

   /**
   * Tax rate
   * @return taxRate
  **/
  @ApiModelProperty(value = "Tax rate")
  public Float getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(Float taxRate) {
    this.taxRate = taxRate;
  }

  public RatedProductUsage usageRatingTag(String usageRatingTag) {
    this.usageRatingTag = usageRatingTag;
    return this;
  }

   /**
   * Tag value: [usage]: the usage is always rated outside a usage bundle [included usage]: the usage is rated inside a usage bundle [non included usage]: the usage bundle is exhausted. The usage is rated outside the usage bundle
   * @return usageRatingTag
  **/
  @ApiModelProperty(value = "Tag value: [usage]: the usage is always rated outside a usage bundle [included usage]: the usage is rated inside a usage bundle [non included usage]: the usage bundle is exhausted. The usage is rated outside the usage bundle")
  public String getUsageRatingTag() {
    return usageRatingTag;
  }

  public void setUsageRatingTag(String usageRatingTag) {
    this.usageRatingTag = usageRatingTag;
  }

  public RatedProductUsage bucketValueConvertedInAmount(Money bucketValueConvertedInAmount) {
    this.bucketValueConvertedInAmount = bucketValueConvertedInAmount;
    return this;
  }

   /**
   * Get bucketValueConvertedInAmount
   * @return bucketValueConvertedInAmount
  **/
  @ApiModelProperty(value = "")
  public Money getBucketValueConvertedInAmount() {
    return bucketValueConvertedInAmount;
  }

  public void setBucketValueConvertedInAmount(Money bucketValueConvertedInAmount) {
    this.bucketValueConvertedInAmount = bucketValueConvertedInAmount;
  }

  public RatedProductUsage productRef(ProductRef productRef) {
    this.productRef = productRef;
    return this;
  }

   /**
   * Get productRef
   * @return productRef
  **/
  @ApiModelProperty(value = "")
  public ProductRef getProductRef() {
    return productRef;
  }

  public void setProductRef(ProductRef productRef) {
    this.productRef = productRef;
  }

  public RatedProductUsage taxExcludedRatingAmount(Money taxExcludedRatingAmount) {
    this.taxExcludedRatingAmount = taxExcludedRatingAmount;
    return this;
  }

   /**
   * Get taxExcludedRatingAmount
   * @return taxExcludedRatingAmount
  **/
  @ApiModelProperty(value = "")
  public Money getTaxExcludedRatingAmount() {
    return taxExcludedRatingAmount;
  }

  public void setTaxExcludedRatingAmount(Money taxExcludedRatingAmount) {
    this.taxExcludedRatingAmount = taxExcludedRatingAmount;
  }

  public RatedProductUsage taxIncludedRatingAmount(Money taxIncludedRatingAmount) {
    this.taxIncludedRatingAmount = taxIncludedRatingAmount;
    return this;
  }

   /**
   * Get taxIncludedRatingAmount
   * @return taxIncludedRatingAmount
  **/
  @ApiModelProperty(value = "")
  public Money getTaxIncludedRatingAmount() {
    return taxIncludedRatingAmount;
  }

  public void setTaxIncludedRatingAmount(Money taxIncludedRatingAmount) {
    this.taxIncludedRatingAmount = taxIncludedRatingAmount;
  }

  public RatedProductUsage baseType(String baseType) {
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

  public RatedProductUsage schemaLocation(String schemaLocation) {
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

  public RatedProductUsage type(String type) {
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
    RatedProductUsage ratedProductUsage = (RatedProductUsage) o;
    return Objects.equals(this.isBilled, ratedProductUsage.isBilled) &&
        Objects.equals(this.isTaxExempt, ratedProductUsage.isTaxExempt) &&
        Objects.equals(this.offerTariffType, ratedProductUsage.offerTariffType) &&
        Objects.equals(this.ratingAmountType, ratedProductUsage.ratingAmountType) &&
        Objects.equals(this.ratingDate, ratedProductUsage.ratingDate) &&
        Objects.equals(this.taxRate, ratedProductUsage.taxRate) &&
        Objects.equals(this.usageRatingTag, ratedProductUsage.usageRatingTag) &&
        Objects.equals(this.bucketValueConvertedInAmount, ratedProductUsage.bucketValueConvertedInAmount) &&
        Objects.equals(this.productRef, ratedProductUsage.productRef) &&
        Objects.equals(this.taxExcludedRatingAmount, ratedProductUsage.taxExcludedRatingAmount) &&
        Objects.equals(this.taxIncludedRatingAmount, ratedProductUsage.taxIncludedRatingAmount) &&
        Objects.equals(this.baseType, ratedProductUsage.baseType) &&
        Objects.equals(this.schemaLocation, ratedProductUsage.schemaLocation) &&
        Objects.equals(this.type, ratedProductUsage.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isBilled, isTaxExempt, offerTariffType, ratingAmountType, ratingDate, taxRate, usageRatingTag, bucketValueConvertedInAmount, productRef, taxExcludedRatingAmount, taxIncludedRatingAmount, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatedProductUsage {\n");
    
    sb.append("    isBilled: ").append(toIndentedString(isBilled)).append("\n");
    sb.append("    isTaxExempt: ").append(toIndentedString(isTaxExempt)).append("\n");
    sb.append("    offerTariffType: ").append(toIndentedString(offerTariffType)).append("\n");
    sb.append("    ratingAmountType: ").append(toIndentedString(ratingAmountType)).append("\n");
    sb.append("    ratingDate: ").append(toIndentedString(ratingDate)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    usageRatingTag: ").append(toIndentedString(usageRatingTag)).append("\n");
    sb.append("    bucketValueConvertedInAmount: ").append(toIndentedString(bucketValueConvertedInAmount)).append("\n");
    sb.append("    productRef: ").append(toIndentedString(productRef)).append("\n");
    sb.append("    taxExcludedRatingAmount: ").append(toIndentedString(taxExcludedRatingAmount)).append("\n");
    sb.append("    taxIncludedRatingAmount: ").append(toIndentedString(taxIncludedRatingAmount)).append("\n");
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

