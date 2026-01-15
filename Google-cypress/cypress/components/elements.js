export const Elements = {
  textSearch: "bstqb.qa",
  urlGoogle: "https://www.google.com",
  emailInvalid: "email_invalido@gmail.com",

  inputSearch: 'textarea[name="q"]',
  btnSearch: 'input[name="btnK"]',
  btnImageXpath: "//a[contains(@href, 'imghp')] | //a[text()='Images']",
  btnAppGoogle: 'a[aria-label="Apps do Google"], #gbwa',
  btnYoutube: 'a[href*="youtube.com"]',
  btnDrive: 'a[href*="drive.google.com"]',
  btnGmail: 'a[href*="mail.google.com"]',
  btnMaps: 'a[href*="maps.google"]',
  btnLogin: () => cy.get('.gb_A'),
  btnTermos: () => cy.get('a[href*="policies.google.com/terms"]'),
  blocoPerguntas: () => cy.get('div[data-initq]').first()
}
