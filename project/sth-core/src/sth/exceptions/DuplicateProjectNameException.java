package sth.exceptions;

/** Exception thrown when the requested project already exists. */
public class DuplicateProjectNameException extends Exception {

  /** Serial number for serialization. */
  // private static final long serialVersionUID = 201809021324L;

  /** Project name. */
  private String _name;

  /**
   * @param name
   */
  public DuplicateProjectNameException(String name) {
    _name = name;
  }

  /** @return name */
  public String getName() {
    return _name;
  }

}
