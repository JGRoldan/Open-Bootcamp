const winston = require('winston');

const logger = winston.createLogger({
  level: 'debug',
  format: winston.format.json(),
  defaultMeta: { service: 'user-service' },
  transports: [
    //
    // - Write all logs with importance level of `error` or less to `error.log`
    // - Write all logs with importance level of `info` or less to `combined.log`
    //
    new winston.transports.File({ filename: 'error.log', level: 'debug' }),
  ],
});

function showError(){
    throw new Error("Tienes un error en la función");
}

try {
    showError();
}catch (e) {
    logger.log("debug", e.toString())
}