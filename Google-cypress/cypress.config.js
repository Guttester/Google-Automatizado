const { defineConfig } = require("cypress");

module.exports = defineConfig({
  e2e: {
    userAgent: 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36',
    chromeWebSecurity: false,
    setupNodeEvents(on, config) {
      // implement node event listeners here
    },
    setupNodeEvents(on, config) {
      on('before:browser:launch', (browser = {}, launchOptions) => {
        if (browser.family === 'chromium' && browser.name !== 'electron') {
          launchOptions.args = launchOptions.args.filter(element => element !== '--enable-automation')
          launchOptions.args.push('--disable-blink-features=AutomationControlled')
        }
        return launchOptions
      })
    },
  },
});
