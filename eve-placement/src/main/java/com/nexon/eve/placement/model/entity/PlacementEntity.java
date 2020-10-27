package com.nexon.eve.placement.model.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "placement")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PlacementEntity implements Serializable {

  @Id
  private String placementId;
  private String appAlias;
  private enum status

}
