import { LkrFormatterPipe } from './employees/shared/lkr-formatter.pipe';

describe('LkrFormatterPipe', () => {
  it('create an instance', () => {
    const pipe = new LkrFormatterPipe();
    expect(pipe).toBeTruthy();
  });
});
