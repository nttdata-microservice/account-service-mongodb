package com.nttdata.account.model.document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "accounts")  // DB: Plural
public class Account {  // UpperCammel Case - Singular

  @Id
  private String id;
  private String numberAccount; //  lowerCammel Case
  private Float amount;
  private String customer;
}
