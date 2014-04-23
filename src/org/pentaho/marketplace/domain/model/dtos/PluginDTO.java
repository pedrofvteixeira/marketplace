package org.pentaho.marketplace.domain.model.dtos;

public class PluginDTO extends DTO {

  //region Attributes
  public String id;
  public String name;
  public String img;
  public String smallImg;
  public String learnMoreUrl;
  public String description;
  public String company;
  public String companyUrl;
  public String companyLogo;
  public String installedBranch;
  public String installedVersion;
  public String installedBuildId;
  public String installationNotes;
  public boolean installed;
  public Iterable<PluginVersionDTO> versions;
  public String[] screenshots;
  public String dependencies;
  public String license;
  //endregion
}
