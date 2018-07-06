package io.swagger.model;


import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

public class ApiUrlsResponse  {
  
  @ApiModelProperty(value = "")
  private String accountUrl = null;
  @ApiModelProperty(value = "")
  private String accountVerifiedUrl = null;
  @ApiModelProperty(value = "")
  private String addressUrl = null;
  @ApiModelProperty(value = "")
  private String addressesUrl = null;
  @ApiModelProperty(value = "")
  private String addressNumbersUrl = null;
  @ApiModelProperty(value = "")
  private String authorizationOauthClientsUrl = null;
  @ApiModelProperty(value = "")
  private String authorizationOauthClientUrl = null;
  @ApiModelProperty(value = "")
  private String authorizationTokenUrl = null;
  @ApiModelProperty(value = "")
  private String balanceUrl = null;
  @ApiModelProperty(value = "")
  private String contactsUrl = null;
  @ApiModelProperty(value = "")
  private String internalContactsUrl = null;
  @ApiModelProperty(value = "")
  private String deviceCallerIdUrl = null;
  @ApiModelProperty(value = "")
  private String deviceUrl = null;
  @ApiModelProperty(value = "")
  private String devicesTariffAnnouncementUrl = null;
  @ApiModelProperty(value = "")
  private String devicesSingleRowDisplayUrl = null;
  @ApiModelProperty(value = "")
  private String deviceSimOrdersUrl = null;
  @ApiModelProperty(value = "")
  private String faxlinesUrl = null;
  @ApiModelProperty(value = "")
  private String faxlineUrl = null;
  @ApiModelProperty(value = "")
  private String faxlineNumbersUrl = null;
  @ApiModelProperty(value = "")
  private String groupsUrl = null;
  @ApiModelProperty(value = "")
  private String groupUserUrl = null;
  @ApiModelProperty(value = "")
  private String groupNumbersUrl = null;
  @ApiModelProperty(value = "")
  private String historyEntryUrl = null;
  @ApiModelProperty(value = "")
  private String historyUrl = null;
  @ApiModelProperty(value = "")
  private String notificationsUrl = null;
  @ApiModelProperty(value = "")
  private String numberUrl = null;
  @ApiModelProperty(value = "")
  private String numbersUrl = null;
  @ApiModelProperty(value = "")
  private String webuserNumbersUrl = null;
  @ApiModelProperty(value = "")
  private String addDirectDialUrl = null;
  @ApiModelProperty(value = "")
  private String changeDirectDialUrl = null;
  @ApiModelProperty(value = "")
  private String deleteDirectDialUrl = null;
  @ApiModelProperty(value = "")
  private String phonelineUrl = null;
  @ApiModelProperty(value = "")
  private String phonelineBlockAnonymousUrl = null;
  @ApiModelProperty(value = "")
  private String phonelineBusyOnBusyUrl = null;
  @ApiModelProperty(value = "")
  private String phonelineDevicesUrl = null;
  @ApiModelProperty(value = "")
  private String phonelineForwardingsUrl = null;
  @ApiModelProperty(value = "")
  private String phonelineNumbersUrl = null;
  @ApiModelProperty(value = "")
  private String phonelinesParallelForwardingUrl = null;
  @ApiModelProperty(value = "")
  private String phonelinesParallelForwardingsUrl = null;
  @ApiModelProperty(value = "")
  private String phonelineSipgateIoUrl = null;
  @ApiModelProperty(value = "")
  private String phonelineSipgateIoLogUrl = null;
  @ApiModelProperty(value = "")
  private String phonelineVoicemailGreetingUrl = null;
  @ApiModelProperty(value = "")
  private String phonelineVoicemailGreetingsUrl = null;
  @ApiModelProperty(value = "")
  private String phonelineVoicemailUrl = null;
  @ApiModelProperty(value = "")
  private String phonelineVoicemailsUrl = null;
  @ApiModelProperty(value = "")
  private String phonelinesUrl = null;
  @ApiModelProperty(value = "")
  private String portingUrl = null;
  @ApiModelProperty(value = "")
  private String portingsUrl = null;
  @ApiModelProperty(value = "")
  private String restrictionsUrl = null;
  @ApiModelProperty(value = "")
  private String sessionsCallUrl = null;
  @ApiModelProperty(value = "")
  private String settingsSipgateioUrl = null;
  @ApiModelProperty(value = "")
  private String smsUrl = null;
  @ApiModelProperty(value = "")
  private String smsCallerIdsUrl = null;
  @ApiModelProperty(value = "")
  private String translationsUrl = null;
  @ApiModelProperty(value = "")
  private String userInfoUrl = null;
  @ApiModelProperty(value = "")
  private String userUrl = null;
  @ApiModelProperty(value = "")
  private String userDefaultDeviceUrl = null;
  @ApiModelProperty(value = "")
  private String userDevicesUrl = null;
  @ApiModelProperty(value = "")
  private String userExternalDevicesUrl = null;
  @ApiModelProperty(value = "")
  private String userMobileDevicesUrl = null;
  @ApiModelProperty(value = "")
  private String userRegisterDevicesUrl = null;
  @ApiModelProperty(value = "")
  private String usersUrl = null;

 /**
   * Get accountUrl
   * @return accountUrl
  **/
  public String getAccountUrl() {
    return accountUrl;
  }

  public void setAccountUrl(String accountUrl) {
    this.accountUrl = accountUrl;
  }

  public ApiUrlsResponse accountUrl(String accountUrl) {
    this.accountUrl = accountUrl;
    return this;
  }

 /**
   * Get accountVerifiedUrl
   * @return accountVerifiedUrl
  **/
  public String getAccountVerifiedUrl() {
    return accountVerifiedUrl;
  }

  public void setAccountVerifiedUrl(String accountVerifiedUrl) {
    this.accountVerifiedUrl = accountVerifiedUrl;
  }

  public ApiUrlsResponse accountVerifiedUrl(String accountVerifiedUrl) {
    this.accountVerifiedUrl = accountVerifiedUrl;
    return this;
  }

 /**
   * Get addressUrl
   * @return addressUrl
  **/
  public String getAddressUrl() {
    return addressUrl;
  }

  public void setAddressUrl(String addressUrl) {
    this.addressUrl = addressUrl;
  }

  public ApiUrlsResponse addressUrl(String addressUrl) {
    this.addressUrl = addressUrl;
    return this;
  }

 /**
   * Get addressesUrl
   * @return addressesUrl
  **/
  public String getAddressesUrl() {
    return addressesUrl;
  }

  public void setAddressesUrl(String addressesUrl) {
    this.addressesUrl = addressesUrl;
  }

  public ApiUrlsResponse addressesUrl(String addressesUrl) {
    this.addressesUrl = addressesUrl;
    return this;
  }

 /**
   * Get addressNumbersUrl
   * @return addressNumbersUrl
  **/
  public String getAddressNumbersUrl() {
    return addressNumbersUrl;
  }

  public void setAddressNumbersUrl(String addressNumbersUrl) {
    this.addressNumbersUrl = addressNumbersUrl;
  }

  public ApiUrlsResponse addressNumbersUrl(String addressNumbersUrl) {
    this.addressNumbersUrl = addressNumbersUrl;
    return this;
  }

 /**
   * Get authorizationOauthClientsUrl
   * @return authorizationOauthClientsUrl
  **/
  public String getAuthorizationOauthClientsUrl() {
    return authorizationOauthClientsUrl;
  }

  public void setAuthorizationOauthClientsUrl(String authorizationOauthClientsUrl) {
    this.authorizationOauthClientsUrl = authorizationOauthClientsUrl;
  }

  public ApiUrlsResponse authorizationOauthClientsUrl(String authorizationOauthClientsUrl) {
    this.authorizationOauthClientsUrl = authorizationOauthClientsUrl;
    return this;
  }

 /**
   * Get authorizationOauthClientUrl
   * @return authorizationOauthClientUrl
  **/
  public String getAuthorizationOauthClientUrl() {
    return authorizationOauthClientUrl;
  }

  public void setAuthorizationOauthClientUrl(String authorizationOauthClientUrl) {
    this.authorizationOauthClientUrl = authorizationOauthClientUrl;
  }

  public ApiUrlsResponse authorizationOauthClientUrl(String authorizationOauthClientUrl) {
    this.authorizationOauthClientUrl = authorizationOauthClientUrl;
    return this;
  }

 /**
   * Get authorizationTokenUrl
   * @return authorizationTokenUrl
  **/
  public String getAuthorizationTokenUrl() {
    return authorizationTokenUrl;
  }

  public void setAuthorizationTokenUrl(String authorizationTokenUrl) {
    this.authorizationTokenUrl = authorizationTokenUrl;
  }

  public ApiUrlsResponse authorizationTokenUrl(String authorizationTokenUrl) {
    this.authorizationTokenUrl = authorizationTokenUrl;
    return this;
  }

 /**
   * Get balanceUrl
   * @return balanceUrl
  **/
  public String getBalanceUrl() {
    return balanceUrl;
  }

  public void setBalanceUrl(String balanceUrl) {
    this.balanceUrl = balanceUrl;
  }

  public ApiUrlsResponse balanceUrl(String balanceUrl) {
    this.balanceUrl = balanceUrl;
    return this;
  }

 /**
   * Get contactsUrl
   * @return contactsUrl
  **/
  public String getContactsUrl() {
    return contactsUrl;
  }

  public void setContactsUrl(String contactsUrl) {
    this.contactsUrl = contactsUrl;
  }

  public ApiUrlsResponse contactsUrl(String contactsUrl) {
    this.contactsUrl = contactsUrl;
    return this;
  }

 /**
   * Get internalContactsUrl
   * @return internalContactsUrl
  **/
  public String getInternalContactsUrl() {
    return internalContactsUrl;
  }

  public void setInternalContactsUrl(String internalContactsUrl) {
    this.internalContactsUrl = internalContactsUrl;
  }

  public ApiUrlsResponse internalContactsUrl(String internalContactsUrl) {
    this.internalContactsUrl = internalContactsUrl;
    return this;
  }

 /**
   * Get deviceCallerIdUrl
   * @return deviceCallerIdUrl
  **/
  public String getDeviceCallerIdUrl() {
    return deviceCallerIdUrl;
  }

  public void setDeviceCallerIdUrl(String deviceCallerIdUrl) {
    this.deviceCallerIdUrl = deviceCallerIdUrl;
  }

  public ApiUrlsResponse deviceCallerIdUrl(String deviceCallerIdUrl) {
    this.deviceCallerIdUrl = deviceCallerIdUrl;
    return this;
  }

 /**
   * Get deviceUrl
   * @return deviceUrl
  **/
  public String getDeviceUrl() {
    return deviceUrl;
  }

  public void setDeviceUrl(String deviceUrl) {
    this.deviceUrl = deviceUrl;
  }

  public ApiUrlsResponse deviceUrl(String deviceUrl) {
    this.deviceUrl = deviceUrl;
    return this;
  }

 /**
   * Get devicesTariffAnnouncementUrl
   * @return devicesTariffAnnouncementUrl
  **/
  public String getDevicesTariffAnnouncementUrl() {
    return devicesTariffAnnouncementUrl;
  }

  public void setDevicesTariffAnnouncementUrl(String devicesTariffAnnouncementUrl) {
    this.devicesTariffAnnouncementUrl = devicesTariffAnnouncementUrl;
  }

  public ApiUrlsResponse devicesTariffAnnouncementUrl(String devicesTariffAnnouncementUrl) {
    this.devicesTariffAnnouncementUrl = devicesTariffAnnouncementUrl;
    return this;
  }

 /**
   * Get devicesSingleRowDisplayUrl
   * @return devicesSingleRowDisplayUrl
  **/
  public String getDevicesSingleRowDisplayUrl() {
    return devicesSingleRowDisplayUrl;
  }

  public void setDevicesSingleRowDisplayUrl(String devicesSingleRowDisplayUrl) {
    this.devicesSingleRowDisplayUrl = devicesSingleRowDisplayUrl;
  }

  public ApiUrlsResponse devicesSingleRowDisplayUrl(String devicesSingleRowDisplayUrl) {
    this.devicesSingleRowDisplayUrl = devicesSingleRowDisplayUrl;
    return this;
  }

 /**
   * Get deviceSimOrdersUrl
   * @return deviceSimOrdersUrl
  **/
  public String getDeviceSimOrdersUrl() {
    return deviceSimOrdersUrl;
  }

  public void setDeviceSimOrdersUrl(String deviceSimOrdersUrl) {
    this.deviceSimOrdersUrl = deviceSimOrdersUrl;
  }

  public ApiUrlsResponse deviceSimOrdersUrl(String deviceSimOrdersUrl) {
    this.deviceSimOrdersUrl = deviceSimOrdersUrl;
    return this;
  }

 /**
   * Get faxlinesUrl
   * @return faxlinesUrl
  **/
  public String getFaxlinesUrl() {
    return faxlinesUrl;
  }

  public void setFaxlinesUrl(String faxlinesUrl) {
    this.faxlinesUrl = faxlinesUrl;
  }

  public ApiUrlsResponse faxlinesUrl(String faxlinesUrl) {
    this.faxlinesUrl = faxlinesUrl;
    return this;
  }

 /**
   * Get faxlineUrl
   * @return faxlineUrl
  **/
  public String getFaxlineUrl() {
    return faxlineUrl;
  }

  public void setFaxlineUrl(String faxlineUrl) {
    this.faxlineUrl = faxlineUrl;
  }

  public ApiUrlsResponse faxlineUrl(String faxlineUrl) {
    this.faxlineUrl = faxlineUrl;
    return this;
  }

 /**
   * Get faxlineNumbersUrl
   * @return faxlineNumbersUrl
  **/
  public String getFaxlineNumbersUrl() {
    return faxlineNumbersUrl;
  }

  public void setFaxlineNumbersUrl(String faxlineNumbersUrl) {
    this.faxlineNumbersUrl = faxlineNumbersUrl;
  }

  public ApiUrlsResponse faxlineNumbersUrl(String faxlineNumbersUrl) {
    this.faxlineNumbersUrl = faxlineNumbersUrl;
    return this;
  }

 /**
   * Get groupsUrl
   * @return groupsUrl
  **/
  public String getGroupsUrl() {
    return groupsUrl;
  }

  public void setGroupsUrl(String groupsUrl) {
    this.groupsUrl = groupsUrl;
  }

  public ApiUrlsResponse groupsUrl(String groupsUrl) {
    this.groupsUrl = groupsUrl;
    return this;
  }

 /**
   * Get groupUserUrl
   * @return groupUserUrl
  **/
  public String getGroupUserUrl() {
    return groupUserUrl;
  }

  public void setGroupUserUrl(String groupUserUrl) {
    this.groupUserUrl = groupUserUrl;
  }

  public ApiUrlsResponse groupUserUrl(String groupUserUrl) {
    this.groupUserUrl = groupUserUrl;
    return this;
  }

 /**
   * Get groupNumbersUrl
   * @return groupNumbersUrl
  **/
  public String getGroupNumbersUrl() {
    return groupNumbersUrl;
  }

  public void setGroupNumbersUrl(String groupNumbersUrl) {
    this.groupNumbersUrl = groupNumbersUrl;
  }

  public ApiUrlsResponse groupNumbersUrl(String groupNumbersUrl) {
    this.groupNumbersUrl = groupNumbersUrl;
    return this;
  }

 /**
   * Get historyEntryUrl
   * @return historyEntryUrl
  **/
  public String getHistoryEntryUrl() {
    return historyEntryUrl;
  }

  public void setHistoryEntryUrl(String historyEntryUrl) {
    this.historyEntryUrl = historyEntryUrl;
  }

  public ApiUrlsResponse historyEntryUrl(String historyEntryUrl) {
    this.historyEntryUrl = historyEntryUrl;
    return this;
  }

 /**
   * Get historyUrl
   * @return historyUrl
  **/
  public String getHistoryUrl() {
    return historyUrl;
  }

  public void setHistoryUrl(String historyUrl) {
    this.historyUrl = historyUrl;
  }

  public ApiUrlsResponse historyUrl(String historyUrl) {
    this.historyUrl = historyUrl;
    return this;
  }

 /**
   * Get notificationsUrl
   * @return notificationsUrl
  **/
  public String getNotificationsUrl() {
    return notificationsUrl;
  }

  public void setNotificationsUrl(String notificationsUrl) {
    this.notificationsUrl = notificationsUrl;
  }

  public ApiUrlsResponse notificationsUrl(String notificationsUrl) {
    this.notificationsUrl = notificationsUrl;
    return this;
  }

 /**
   * Get numberUrl
   * @return numberUrl
  **/
  public String getNumberUrl() {
    return numberUrl;
  }

  public void setNumberUrl(String numberUrl) {
    this.numberUrl = numberUrl;
  }

  public ApiUrlsResponse numberUrl(String numberUrl) {
    this.numberUrl = numberUrl;
    return this;
  }

 /**
   * Get numbersUrl
   * @return numbersUrl
  **/
  public String getNumbersUrl() {
    return numbersUrl;
  }

  public void setNumbersUrl(String numbersUrl) {
    this.numbersUrl = numbersUrl;
  }

  public ApiUrlsResponse numbersUrl(String numbersUrl) {
    this.numbersUrl = numbersUrl;
    return this;
  }

 /**
   * Get webuserNumbersUrl
   * @return webuserNumbersUrl
  **/
  public String getWebuserNumbersUrl() {
    return webuserNumbersUrl;
  }

  public void setWebuserNumbersUrl(String webuserNumbersUrl) {
    this.webuserNumbersUrl = webuserNumbersUrl;
  }

  public ApiUrlsResponse webuserNumbersUrl(String webuserNumbersUrl) {
    this.webuserNumbersUrl = webuserNumbersUrl;
    return this;
  }

 /**
   * Get addDirectDialUrl
   * @return addDirectDialUrl
  **/
  public String getAddDirectDialUrl() {
    return addDirectDialUrl;
  }

  public void setAddDirectDialUrl(String addDirectDialUrl) {
    this.addDirectDialUrl = addDirectDialUrl;
  }

  public ApiUrlsResponse addDirectDialUrl(String addDirectDialUrl) {
    this.addDirectDialUrl = addDirectDialUrl;
    return this;
  }

 /**
   * Get changeDirectDialUrl
   * @return changeDirectDialUrl
  **/
  public String getChangeDirectDialUrl() {
    return changeDirectDialUrl;
  }

  public void setChangeDirectDialUrl(String changeDirectDialUrl) {
    this.changeDirectDialUrl = changeDirectDialUrl;
  }

  public ApiUrlsResponse changeDirectDialUrl(String changeDirectDialUrl) {
    this.changeDirectDialUrl = changeDirectDialUrl;
    return this;
  }

 /**
   * Get deleteDirectDialUrl
   * @return deleteDirectDialUrl
  **/
  public String getDeleteDirectDialUrl() {
    return deleteDirectDialUrl;
  }

  public void setDeleteDirectDialUrl(String deleteDirectDialUrl) {
    this.deleteDirectDialUrl = deleteDirectDialUrl;
  }

  public ApiUrlsResponse deleteDirectDialUrl(String deleteDirectDialUrl) {
    this.deleteDirectDialUrl = deleteDirectDialUrl;
    return this;
  }

 /**
   * Get phonelineUrl
   * @return phonelineUrl
  **/
  public String getPhonelineUrl() {
    return phonelineUrl;
  }

  public void setPhonelineUrl(String phonelineUrl) {
    this.phonelineUrl = phonelineUrl;
  }

  public ApiUrlsResponse phonelineUrl(String phonelineUrl) {
    this.phonelineUrl = phonelineUrl;
    return this;
  }

 /**
   * Get phonelineBlockAnonymousUrl
   * @return phonelineBlockAnonymousUrl
  **/
  public String getPhonelineBlockAnonymousUrl() {
    return phonelineBlockAnonymousUrl;
  }

  public void setPhonelineBlockAnonymousUrl(String phonelineBlockAnonymousUrl) {
    this.phonelineBlockAnonymousUrl = phonelineBlockAnonymousUrl;
  }

  public ApiUrlsResponse phonelineBlockAnonymousUrl(String phonelineBlockAnonymousUrl) {
    this.phonelineBlockAnonymousUrl = phonelineBlockAnonymousUrl;
    return this;
  }

 /**
   * Get phonelineBusyOnBusyUrl
   * @return phonelineBusyOnBusyUrl
  **/
  public String getPhonelineBusyOnBusyUrl() {
    return phonelineBusyOnBusyUrl;
  }

  public void setPhonelineBusyOnBusyUrl(String phonelineBusyOnBusyUrl) {
    this.phonelineBusyOnBusyUrl = phonelineBusyOnBusyUrl;
  }

  public ApiUrlsResponse phonelineBusyOnBusyUrl(String phonelineBusyOnBusyUrl) {
    this.phonelineBusyOnBusyUrl = phonelineBusyOnBusyUrl;
    return this;
  }

 /**
   * Get phonelineDevicesUrl
   * @return phonelineDevicesUrl
  **/
  public String getPhonelineDevicesUrl() {
    return phonelineDevicesUrl;
  }

  public void setPhonelineDevicesUrl(String phonelineDevicesUrl) {
    this.phonelineDevicesUrl = phonelineDevicesUrl;
  }

  public ApiUrlsResponse phonelineDevicesUrl(String phonelineDevicesUrl) {
    this.phonelineDevicesUrl = phonelineDevicesUrl;
    return this;
  }

 /**
   * Get phonelineForwardingsUrl
   * @return phonelineForwardingsUrl
  **/
  public String getPhonelineForwardingsUrl() {
    return phonelineForwardingsUrl;
  }

  public void setPhonelineForwardingsUrl(String phonelineForwardingsUrl) {
    this.phonelineForwardingsUrl = phonelineForwardingsUrl;
  }

  public ApiUrlsResponse phonelineForwardingsUrl(String phonelineForwardingsUrl) {
    this.phonelineForwardingsUrl = phonelineForwardingsUrl;
    return this;
  }

 /**
   * Get phonelineNumbersUrl
   * @return phonelineNumbersUrl
  **/
  public String getPhonelineNumbersUrl() {
    return phonelineNumbersUrl;
  }

  public void setPhonelineNumbersUrl(String phonelineNumbersUrl) {
    this.phonelineNumbersUrl = phonelineNumbersUrl;
  }

  public ApiUrlsResponse phonelineNumbersUrl(String phonelineNumbersUrl) {
    this.phonelineNumbersUrl = phonelineNumbersUrl;
    return this;
  }

 /**
   * Get phonelinesParallelForwardingUrl
   * @return phonelinesParallelForwardingUrl
  **/
  public String getPhonelinesParallelForwardingUrl() {
    return phonelinesParallelForwardingUrl;
  }

  public void setPhonelinesParallelForwardingUrl(String phonelinesParallelForwardingUrl) {
    this.phonelinesParallelForwardingUrl = phonelinesParallelForwardingUrl;
  }

  public ApiUrlsResponse phonelinesParallelForwardingUrl(String phonelinesParallelForwardingUrl) {
    this.phonelinesParallelForwardingUrl = phonelinesParallelForwardingUrl;
    return this;
  }

 /**
   * Get phonelinesParallelForwardingsUrl
   * @return phonelinesParallelForwardingsUrl
  **/
  public String getPhonelinesParallelForwardingsUrl() {
    return phonelinesParallelForwardingsUrl;
  }

  public void setPhonelinesParallelForwardingsUrl(String phonelinesParallelForwardingsUrl) {
    this.phonelinesParallelForwardingsUrl = phonelinesParallelForwardingsUrl;
  }

  public ApiUrlsResponse phonelinesParallelForwardingsUrl(String phonelinesParallelForwardingsUrl) {
    this.phonelinesParallelForwardingsUrl = phonelinesParallelForwardingsUrl;
    return this;
  }

 /**
   * Get phonelineSipgateIoUrl
   * @return phonelineSipgateIoUrl
  **/
  public String getPhonelineSipgateIoUrl() {
    return phonelineSipgateIoUrl;
  }

  public void setPhonelineSipgateIoUrl(String phonelineSipgateIoUrl) {
    this.phonelineSipgateIoUrl = phonelineSipgateIoUrl;
  }

  public ApiUrlsResponse phonelineSipgateIoUrl(String phonelineSipgateIoUrl) {
    this.phonelineSipgateIoUrl = phonelineSipgateIoUrl;
    return this;
  }

 /**
   * Get phonelineSipgateIoLogUrl
   * @return phonelineSipgateIoLogUrl
  **/
  public String getPhonelineSipgateIoLogUrl() {
    return phonelineSipgateIoLogUrl;
  }

  public void setPhonelineSipgateIoLogUrl(String phonelineSipgateIoLogUrl) {
    this.phonelineSipgateIoLogUrl = phonelineSipgateIoLogUrl;
  }

  public ApiUrlsResponse phonelineSipgateIoLogUrl(String phonelineSipgateIoLogUrl) {
    this.phonelineSipgateIoLogUrl = phonelineSipgateIoLogUrl;
    return this;
  }

 /**
   * Get phonelineVoicemailGreetingUrl
   * @return phonelineVoicemailGreetingUrl
  **/
  public String getPhonelineVoicemailGreetingUrl() {
    return phonelineVoicemailGreetingUrl;
  }

  public void setPhonelineVoicemailGreetingUrl(String phonelineVoicemailGreetingUrl) {
    this.phonelineVoicemailGreetingUrl = phonelineVoicemailGreetingUrl;
  }

  public ApiUrlsResponse phonelineVoicemailGreetingUrl(String phonelineVoicemailGreetingUrl) {
    this.phonelineVoicemailGreetingUrl = phonelineVoicemailGreetingUrl;
    return this;
  }

 /**
   * Get phonelineVoicemailGreetingsUrl
   * @return phonelineVoicemailGreetingsUrl
  **/
  public String getPhonelineVoicemailGreetingsUrl() {
    return phonelineVoicemailGreetingsUrl;
  }

  public void setPhonelineVoicemailGreetingsUrl(String phonelineVoicemailGreetingsUrl) {
    this.phonelineVoicemailGreetingsUrl = phonelineVoicemailGreetingsUrl;
  }

  public ApiUrlsResponse phonelineVoicemailGreetingsUrl(String phonelineVoicemailGreetingsUrl) {
    this.phonelineVoicemailGreetingsUrl = phonelineVoicemailGreetingsUrl;
    return this;
  }

 /**
   * Get phonelineVoicemailUrl
   * @return phonelineVoicemailUrl
  **/
  public String getPhonelineVoicemailUrl() {
    return phonelineVoicemailUrl;
  }

  public void setPhonelineVoicemailUrl(String phonelineVoicemailUrl) {
    this.phonelineVoicemailUrl = phonelineVoicemailUrl;
  }

  public ApiUrlsResponse phonelineVoicemailUrl(String phonelineVoicemailUrl) {
    this.phonelineVoicemailUrl = phonelineVoicemailUrl;
    return this;
  }

 /**
   * Get phonelineVoicemailsUrl
   * @return phonelineVoicemailsUrl
  **/
  public String getPhonelineVoicemailsUrl() {
    return phonelineVoicemailsUrl;
  }

  public void setPhonelineVoicemailsUrl(String phonelineVoicemailsUrl) {
    this.phonelineVoicemailsUrl = phonelineVoicemailsUrl;
  }

  public ApiUrlsResponse phonelineVoicemailsUrl(String phonelineVoicemailsUrl) {
    this.phonelineVoicemailsUrl = phonelineVoicemailsUrl;
    return this;
  }

 /**
   * Get phonelinesUrl
   * @return phonelinesUrl
  **/
  public String getPhonelinesUrl() {
    return phonelinesUrl;
  }

  public void setPhonelinesUrl(String phonelinesUrl) {
    this.phonelinesUrl = phonelinesUrl;
  }

  public ApiUrlsResponse phonelinesUrl(String phonelinesUrl) {
    this.phonelinesUrl = phonelinesUrl;
    return this;
  }

 /**
   * Get portingUrl
   * @return portingUrl
  **/
  public String getPortingUrl() {
    return portingUrl;
  }

  public void setPortingUrl(String portingUrl) {
    this.portingUrl = portingUrl;
  }

  public ApiUrlsResponse portingUrl(String portingUrl) {
    this.portingUrl = portingUrl;
    return this;
  }

 /**
   * Get portingsUrl
   * @return portingsUrl
  **/
  public String getPortingsUrl() {
    return portingsUrl;
  }

  public void setPortingsUrl(String portingsUrl) {
    this.portingsUrl = portingsUrl;
  }

  public ApiUrlsResponse portingsUrl(String portingsUrl) {
    this.portingsUrl = portingsUrl;
    return this;
  }

 /**
   * Get restrictionsUrl
   * @return restrictionsUrl
  **/
  public String getRestrictionsUrl() {
    return restrictionsUrl;
  }

  public void setRestrictionsUrl(String restrictionsUrl) {
    this.restrictionsUrl = restrictionsUrl;
  }

  public ApiUrlsResponse restrictionsUrl(String restrictionsUrl) {
    this.restrictionsUrl = restrictionsUrl;
    return this;
  }

 /**
   * Get sessionsCallUrl
   * @return sessionsCallUrl
  **/
  public String getSessionsCallUrl() {
    return sessionsCallUrl;
  }

  public void setSessionsCallUrl(String sessionsCallUrl) {
    this.sessionsCallUrl = sessionsCallUrl;
  }

  public ApiUrlsResponse sessionsCallUrl(String sessionsCallUrl) {
    this.sessionsCallUrl = sessionsCallUrl;
    return this;
  }

 /**
   * Get settingsSipgateioUrl
   * @return settingsSipgateioUrl
  **/
  public String getSettingsSipgateioUrl() {
    return settingsSipgateioUrl;
  }

  public void setSettingsSipgateioUrl(String settingsSipgateioUrl) {
    this.settingsSipgateioUrl = settingsSipgateioUrl;
  }

  public ApiUrlsResponse settingsSipgateioUrl(String settingsSipgateioUrl) {
    this.settingsSipgateioUrl = settingsSipgateioUrl;
    return this;
  }

 /**
   * Get smsUrl
   * @return smsUrl
  **/
  public String getSmsUrl() {
    return smsUrl;
  }

  public void setSmsUrl(String smsUrl) {
    this.smsUrl = smsUrl;
  }

  public ApiUrlsResponse smsUrl(String smsUrl) {
    this.smsUrl = smsUrl;
    return this;
  }

 /**
   * Get smsCallerIdsUrl
   * @return smsCallerIdsUrl
  **/
  public String getSmsCallerIdsUrl() {
    return smsCallerIdsUrl;
  }

  public void setSmsCallerIdsUrl(String smsCallerIdsUrl) {
    this.smsCallerIdsUrl = smsCallerIdsUrl;
  }

  public ApiUrlsResponse smsCallerIdsUrl(String smsCallerIdsUrl) {
    this.smsCallerIdsUrl = smsCallerIdsUrl;
    return this;
  }

 /**
   * Get translationsUrl
   * @return translationsUrl
  **/
  public String getTranslationsUrl() {
    return translationsUrl;
  }

  public void setTranslationsUrl(String translationsUrl) {
    this.translationsUrl = translationsUrl;
  }

  public ApiUrlsResponse translationsUrl(String translationsUrl) {
    this.translationsUrl = translationsUrl;
    return this;
  }

 /**
   * Get userInfoUrl
   * @return userInfoUrl
  **/
  public String getUserInfoUrl() {
    return userInfoUrl;
  }

  public void setUserInfoUrl(String userInfoUrl) {
    this.userInfoUrl = userInfoUrl;
  }

  public ApiUrlsResponse userInfoUrl(String userInfoUrl) {
    this.userInfoUrl = userInfoUrl;
    return this;
  }

 /**
   * Get userUrl
   * @return userUrl
  **/
  public String getUserUrl() {
    return userUrl;
  }

  public void setUserUrl(String userUrl) {
    this.userUrl = userUrl;
  }

  public ApiUrlsResponse userUrl(String userUrl) {
    this.userUrl = userUrl;
    return this;
  }

 /**
   * Get userDefaultDeviceUrl
   * @return userDefaultDeviceUrl
  **/
  public String getUserDefaultDeviceUrl() {
    return userDefaultDeviceUrl;
  }

  public void setUserDefaultDeviceUrl(String userDefaultDeviceUrl) {
    this.userDefaultDeviceUrl = userDefaultDeviceUrl;
  }

  public ApiUrlsResponse userDefaultDeviceUrl(String userDefaultDeviceUrl) {
    this.userDefaultDeviceUrl = userDefaultDeviceUrl;
    return this;
  }

 /**
   * Get userDevicesUrl
   * @return userDevicesUrl
  **/
  public String getUserDevicesUrl() {
    return userDevicesUrl;
  }

  public void setUserDevicesUrl(String userDevicesUrl) {
    this.userDevicesUrl = userDevicesUrl;
  }

  public ApiUrlsResponse userDevicesUrl(String userDevicesUrl) {
    this.userDevicesUrl = userDevicesUrl;
    return this;
  }

 /**
   * Get userExternalDevicesUrl
   * @return userExternalDevicesUrl
  **/
  public String getUserExternalDevicesUrl() {
    return userExternalDevicesUrl;
  }

  public void setUserExternalDevicesUrl(String userExternalDevicesUrl) {
    this.userExternalDevicesUrl = userExternalDevicesUrl;
  }

  public ApiUrlsResponse userExternalDevicesUrl(String userExternalDevicesUrl) {
    this.userExternalDevicesUrl = userExternalDevicesUrl;
    return this;
  }

 /**
   * Get userMobileDevicesUrl
   * @return userMobileDevicesUrl
  **/
  public String getUserMobileDevicesUrl() {
    return userMobileDevicesUrl;
  }

  public void setUserMobileDevicesUrl(String userMobileDevicesUrl) {
    this.userMobileDevicesUrl = userMobileDevicesUrl;
  }

  public ApiUrlsResponse userMobileDevicesUrl(String userMobileDevicesUrl) {
    this.userMobileDevicesUrl = userMobileDevicesUrl;
    return this;
  }

 /**
   * Get userRegisterDevicesUrl
   * @return userRegisterDevicesUrl
  **/
  public String getUserRegisterDevicesUrl() {
    return userRegisterDevicesUrl;
  }

  public void setUserRegisterDevicesUrl(String userRegisterDevicesUrl) {
    this.userRegisterDevicesUrl = userRegisterDevicesUrl;
  }

  public ApiUrlsResponse userRegisterDevicesUrl(String userRegisterDevicesUrl) {
    this.userRegisterDevicesUrl = userRegisterDevicesUrl;
    return this;
  }

 /**
   * Get usersUrl
   * @return usersUrl
  **/
  public String getUsersUrl() {
    return usersUrl;
  }

  public void setUsersUrl(String usersUrl) {
    this.usersUrl = usersUrl;
  }

  public ApiUrlsResponse usersUrl(String usersUrl) {
    this.usersUrl = usersUrl;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiUrlsResponse {\n");
    
    sb.append("    accountUrl: ").append(toIndentedString(accountUrl)).append("\n");
    sb.append("    accountVerifiedUrl: ").append(toIndentedString(accountVerifiedUrl)).append("\n");
    sb.append("    addressUrl: ").append(toIndentedString(addressUrl)).append("\n");
    sb.append("    addressesUrl: ").append(toIndentedString(addressesUrl)).append("\n");
    sb.append("    addressNumbersUrl: ").append(toIndentedString(addressNumbersUrl)).append("\n");
    sb.append("    authorizationOauthClientsUrl: ").append(toIndentedString(authorizationOauthClientsUrl)).append("\n");
    sb.append("    authorizationOauthClientUrl: ").append(toIndentedString(authorizationOauthClientUrl)).append("\n");
    sb.append("    authorizationTokenUrl: ").append(toIndentedString(authorizationTokenUrl)).append("\n");
    sb.append("    balanceUrl: ").append(toIndentedString(balanceUrl)).append("\n");
    sb.append("    contactsUrl: ").append(toIndentedString(contactsUrl)).append("\n");
    sb.append("    internalContactsUrl: ").append(toIndentedString(internalContactsUrl)).append("\n");
    sb.append("    deviceCallerIdUrl: ").append(toIndentedString(deviceCallerIdUrl)).append("\n");
    sb.append("    deviceUrl: ").append(toIndentedString(deviceUrl)).append("\n");
    sb.append("    devicesTariffAnnouncementUrl: ").append(toIndentedString(devicesTariffAnnouncementUrl)).append("\n");
    sb.append("    devicesSingleRowDisplayUrl: ").append(toIndentedString(devicesSingleRowDisplayUrl)).append("\n");
    sb.append("    deviceSimOrdersUrl: ").append(toIndentedString(deviceSimOrdersUrl)).append("\n");
    sb.append("    faxlinesUrl: ").append(toIndentedString(faxlinesUrl)).append("\n");
    sb.append("    faxlineUrl: ").append(toIndentedString(faxlineUrl)).append("\n");
    sb.append("    faxlineNumbersUrl: ").append(toIndentedString(faxlineNumbersUrl)).append("\n");
    sb.append("    groupsUrl: ").append(toIndentedString(groupsUrl)).append("\n");
    sb.append("    groupUserUrl: ").append(toIndentedString(groupUserUrl)).append("\n");
    sb.append("    groupNumbersUrl: ").append(toIndentedString(groupNumbersUrl)).append("\n");
    sb.append("    historyEntryUrl: ").append(toIndentedString(historyEntryUrl)).append("\n");
    sb.append("    historyUrl: ").append(toIndentedString(historyUrl)).append("\n");
    sb.append("    notificationsUrl: ").append(toIndentedString(notificationsUrl)).append("\n");
    sb.append("    numberUrl: ").append(toIndentedString(numberUrl)).append("\n");
    sb.append("    numbersUrl: ").append(toIndentedString(numbersUrl)).append("\n");
    sb.append("    webuserNumbersUrl: ").append(toIndentedString(webuserNumbersUrl)).append("\n");
    sb.append("    addDirectDialUrl: ").append(toIndentedString(addDirectDialUrl)).append("\n");
    sb.append("    changeDirectDialUrl: ").append(toIndentedString(changeDirectDialUrl)).append("\n");
    sb.append("    deleteDirectDialUrl: ").append(toIndentedString(deleteDirectDialUrl)).append("\n");
    sb.append("    phonelineUrl: ").append(toIndentedString(phonelineUrl)).append("\n");
    sb.append("    phonelineBlockAnonymousUrl: ").append(toIndentedString(phonelineBlockAnonymousUrl)).append("\n");
    sb.append("    phonelineBusyOnBusyUrl: ").append(toIndentedString(phonelineBusyOnBusyUrl)).append("\n");
    sb.append("    phonelineDevicesUrl: ").append(toIndentedString(phonelineDevicesUrl)).append("\n");
    sb.append("    phonelineForwardingsUrl: ").append(toIndentedString(phonelineForwardingsUrl)).append("\n");
    sb.append("    phonelineNumbersUrl: ").append(toIndentedString(phonelineNumbersUrl)).append("\n");
    sb.append("    phonelinesParallelForwardingUrl: ").append(toIndentedString(phonelinesParallelForwardingUrl)).append("\n");
    sb.append("    phonelinesParallelForwardingsUrl: ").append(toIndentedString(phonelinesParallelForwardingsUrl)).append("\n");
    sb.append("    phonelineSipgateIoUrl: ").append(toIndentedString(phonelineSipgateIoUrl)).append("\n");
    sb.append("    phonelineSipgateIoLogUrl: ").append(toIndentedString(phonelineSipgateIoLogUrl)).append("\n");
    sb.append("    phonelineVoicemailGreetingUrl: ").append(toIndentedString(phonelineVoicemailGreetingUrl)).append("\n");
    sb.append("    phonelineVoicemailGreetingsUrl: ").append(toIndentedString(phonelineVoicemailGreetingsUrl)).append("\n");
    sb.append("    phonelineVoicemailUrl: ").append(toIndentedString(phonelineVoicemailUrl)).append("\n");
    sb.append("    phonelineVoicemailsUrl: ").append(toIndentedString(phonelineVoicemailsUrl)).append("\n");
    sb.append("    phonelinesUrl: ").append(toIndentedString(phonelinesUrl)).append("\n");
    sb.append("    portingUrl: ").append(toIndentedString(portingUrl)).append("\n");
    sb.append("    portingsUrl: ").append(toIndentedString(portingsUrl)).append("\n");
    sb.append("    restrictionsUrl: ").append(toIndentedString(restrictionsUrl)).append("\n");
    sb.append("    sessionsCallUrl: ").append(toIndentedString(sessionsCallUrl)).append("\n");
    sb.append("    settingsSipgateioUrl: ").append(toIndentedString(settingsSipgateioUrl)).append("\n");
    sb.append("    smsUrl: ").append(toIndentedString(smsUrl)).append("\n");
    sb.append("    smsCallerIdsUrl: ").append(toIndentedString(smsCallerIdsUrl)).append("\n");
    sb.append("    translationsUrl: ").append(toIndentedString(translationsUrl)).append("\n");
    sb.append("    userInfoUrl: ").append(toIndentedString(userInfoUrl)).append("\n");
    sb.append("    userUrl: ").append(toIndentedString(userUrl)).append("\n");
    sb.append("    userDefaultDeviceUrl: ").append(toIndentedString(userDefaultDeviceUrl)).append("\n");
    sb.append("    userDevicesUrl: ").append(toIndentedString(userDevicesUrl)).append("\n");
    sb.append("    userExternalDevicesUrl: ").append(toIndentedString(userExternalDevicesUrl)).append("\n");
    sb.append("    userMobileDevicesUrl: ").append(toIndentedString(userMobileDevicesUrl)).append("\n");
    sb.append("    userRegisterDevicesUrl: ").append(toIndentedString(userRegisterDevicesUrl)).append("\n");
    sb.append("    usersUrl: ").append(toIndentedString(usersUrl)).append("\n");
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

