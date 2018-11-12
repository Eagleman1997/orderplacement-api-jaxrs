package rocks.process.orderPlacement.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

public class OrderResponse  {
  
  @ApiModelProperty(value = "")
  private String orderId = null;

  @ApiModelProperty(value = "")
  private String totalOrderPrice = null;

  @ApiModelProperty(value = "")
  private String creationDate = null;
 /**
   * Get orderId
   * @return orderId
  **/
  @JsonProperty("orderId")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public OrderResponse orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

 /**
   * Get totalOrderPrice
   * @return totalOrderPrice
  **/
  @JsonProperty("totalOrderPrice")
  public String getTotalOrderPrice() {
    return totalOrderPrice;
  }

  public void setTotalOrderPrice(String totalOrderPrice) {
    this.totalOrderPrice = totalOrderPrice;
  }

  public OrderResponse totalOrderPrice(String totalOrderPrice) {
    this.totalOrderPrice = totalOrderPrice;
    return this;
  }

 /**
   * Get creationDate
   * @return creationDate
  **/
  @JsonProperty("creationDate")
  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

  public OrderResponse creationDate(String creationDate) {
    this.creationDate = creationDate;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderResponse {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    totalOrderPrice: ").append(toIndentedString(totalOrderPrice)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

