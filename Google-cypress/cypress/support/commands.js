Cypress.Commands.add('login', () => {
  cy.get('#user').type('admin')
})