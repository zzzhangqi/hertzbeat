import { Monitor } from './Monitor';
import { Param } from './Param';

export class Custom {
  app!: String;
  name!: String;
  category!: String;
  monitors!: Monitor[];
  params!: Param[];
}
