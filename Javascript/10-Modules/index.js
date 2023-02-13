import {suma, mult} from "./controller.js"
import chalk from 'chalk';

console.log(suma(60, 25))
console.log(mult(8, 8))

console.log(chalk.cyan('From chalk'));

console.log(chalk.red(suma(60, 25)))
console.log(chalk.green(mult(8, 8)));
