package com.facetable.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "fc_contact")
@SecondaryTable(name = "fc_face")
public class Contact {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  @Column(table = "fc_contact", name = "ID_FC")
  private int idFace;

  @Column(table = "fc_face", name = "NAME")
  private String name;

  @Column(table = "fc_contact", name = "TOWN")
  private String town;

  @Column(table = "fc_face", name = "ID_TYPE")
  private String idType;

  @Column(table = "fc_face", name = "POST")
  private String post;

  @Column(table = "fc_contact", name = "DATE_B")
  private Date birthday;

  @Column(table = "fc_contact", name = "CONTACT")
  private String contacts;

  @Column(table = "fc_contact", name = "DESCRIPTION")
  private String description;

  @Column(table = "fc_face", name = "FAMILY")
  private String family;

  @Column(table = "fc_contact", name = "POST_INDEX")
  private String postIndex;

  @Column(table = "fc_face", name = "ITN")
  private Long itn;

  public Contact() {
  }

  public Contact(int idFace, String name, String town, String idType, String post, Date birthday, String contacts, String description, String family, String postIndex, Long itn) {
    this.idFace = idFace;
    this.name = name;
    this.town = town;
    this.idType = idType;
    this.post = post;
    this.birthday = birthday;
    this.contacts = contacts;
    this.description = description;
    this.family = family;
    this.postIndex = postIndex;
    this.itn = itn;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getIdFace() {
    return idFace;
  }

  public void setIdFace(int idFace) {
    this.idFace = idFace;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTown() {
    return town;
  }

  public void setTown(String town) {
    this.town = town;
  }

  public String getIdType() {
    return idType;
  }

  public void setIdType(String idType) {
    this.idType = idType;
  }

  public String getPost() {
    return post;
  }

  public void setPost(String post) {
    this.post = post;
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  public String getContacts() {
    return contacts;
  }

  public void setContacts(String contacts) {
    this.contacts = contacts;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getFamily() {
    return family;
  }

  public void setFamily(String family) {
    this.family = family;
  }

  public String getPostIndex() {
    return postIndex;
  }

  public void setPostIndex(String postIndex) {
    this.postIndex = postIndex;
  }

  public Long getItn() {
    return itn;
  }

  public void setItn(Long itn) {
    this.itn = itn;
  }
}
