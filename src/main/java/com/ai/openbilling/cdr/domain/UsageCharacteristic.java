package com.ai.openbilling.cdr.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;



/**
 * Provides the value of a given characteristic
 **/

/**
 * Provides the value of a given characteristic
 */
@ApiModel(description = "Provides the value of a given characteristic")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2021-11-18T11:36:14.505+08:00")

public class UsageCharacteristic   {
  private String id = null;

  private String name = null;

  private String valueType = null;

  private List<CharacteristicRelationship> characteristicRelationship = new ArrayList<CharacteristicRelationship>();

  private Any value = null;

  private String baseType = null;

  private String schemaLocation = null;

  private String type = null;

  public UsageCharacteristic id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the characteristic
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the characteristic")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UsageCharacteristic name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the characteristic
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the characteristic")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UsageCharacteristic valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

   /**
   * Data type of the value of the characteristic
   * @return valueType
  **/
  @ApiModelProperty(value = "Data type of the value of the characteristic")
  public String getValueType() {
    return valueType;
  }

  public void setValueType(String valueType) {
    this.valueType = valueType;
  }

  public UsageCharacteristic characteristicRelationship(List<CharacteristicRelationship> characteristicRelationship) {
    this.characteristicRelationship = characteristicRelationship;
    return this;
  }

  public UsageCharacteristic addCharacteristicRelationshipItem(CharacteristicRelationship characteristicRelationshipItem) {
    this.characteristicRelationship.add(characteristicRelationshipItem);
    return this;
  }

   /**
   * Get characteristicRelationship
   * @return characteristicRelationship
  **/
  @ApiModelProperty(value = "")
  public List<CharacteristicRelationship> getCharacteristicRelationship() {
    return characteristicRelationship;
  }

  public void setCharacteristicRelationship(List<CharacteristicRelationship> characteristicRelationship) {
    this.characteristicRelationship = characteristicRelationship;
  }

  public UsageCharacteristic value(Any value) {
    this.value = value;
    return this;
  }

   /**
   * The value of the characteristic
   * @return value
  **/
  @ApiModelProperty(required = true, value = "The value of the characteristic")
  public Any getValue() {
    return value;
  }

  public void setValue(Any value) {
    this.value = value;
  }

  public UsageCharacteristic baseType(String baseType) {
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

  public UsageCharacteristic schemaLocation(String schemaLocation) {
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

  public UsageCharacteristic type(String type) {
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
    UsageCharacteristic usageCharacteristic = (UsageCharacteristic) o;
    return Objects.equals(this.id, usageCharacteristic.id) &&
        Objects.equals(this.name, usageCharacteristic.name) &&
        Objects.equals(this.valueType, usageCharacteristic.valueType) &&
        Objects.equals(this.characteristicRelationship, usageCharacteristic.characteristicRelationship) &&
        Objects.equals(this.value, usageCharacteristic.value) &&
        Objects.equals(this.baseType, usageCharacteristic.baseType) &&
        Objects.equals(this.schemaLocation, usageCharacteristic.schemaLocation) &&
        Objects.equals(this.type, usageCharacteristic.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, valueType, characteristicRelationship, value, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageCharacteristic {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    characteristicRelationship: ").append(toIndentedString(characteristicRelationship)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

