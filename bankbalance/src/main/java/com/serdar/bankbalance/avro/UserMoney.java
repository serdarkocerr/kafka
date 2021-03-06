/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.serdar.bankbalance.avro;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
/** The key value type. */
@org.apache.avro.specific.AvroGenerated
public class UserMoney extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -5195044771725559908L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"UserMoney\",\"namespace\":\"com.serdar.bankbalance.avro\",\"doc\":\"The key value type.\",\"fields\":[{\"name\":\"Name\",\"type\":\"string\",\"doc\":\"The key string, must not be null.\"},{\"name\":\"amount\",\"type\":\"string\",\"doc\":\"The amount string, must not be null.\"},{\"name\":\"time\",\"type\":\"string\",\"doc\":\"The time string, must not be null.\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<UserMoney> ENCODER =
      new BinaryMessageEncoder<UserMoney>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<UserMoney> DECODER =
      new BinaryMessageDecoder<UserMoney>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<UserMoney> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<UserMoney> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<UserMoney>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this UserMoney to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a UserMoney from a ByteBuffer. */
  public static UserMoney fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** The key string, must not be null. */
  @Deprecated public CharSequence Name;
  /** The amount string, must not be null. */
  @Deprecated public CharSequence amount;
  /** The time string, must not be null. */
  @Deprecated public CharSequence time;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public UserMoney() {}

  /**
   * All-args constructor.
   * @param Name The key string, must not be null.
   * @param amount The amount string, must not be null.
   * @param time The time string, must not be null.
   */
  public UserMoney(CharSequence Name, CharSequence amount, CharSequence time) {
    this.Name = Name;
    this.amount = amount;
    this.time = time;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public Object get(int field$) {
    switch (field$) {
    case 0: return Name;
    case 1: return amount;
    case 2: return time;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, Object value$) {
    switch (field$) {
    case 0: Name = (CharSequence)value$; break;
    case 1: amount = (CharSequence)value$; break;
    case 2: time = (CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'Name' field.
   * @return The key string, must not be null.
   */
  public CharSequence getName() {
    return Name;
  }

  /**
   * Sets the value of the 'Name' field.
   * The key string, must not be null.
   * @param value the value to set.
   */
  public void setName(CharSequence value) {
    this.Name = value;
  }

  /**
   * Gets the value of the 'amount' field.
   * @return The amount string, must not be null.
   */
  public CharSequence getAmount() {
    return amount;
  }

  /**
   * Sets the value of the 'amount' field.
   * The amount string, must not be null.
   * @param value the value to set.
   */
  public void setAmount(CharSequence value) {
    this.amount = value;
  }

  /**
   * Gets the value of the 'time' field.
   * @return The time string, must not be null.
   */
  public CharSequence getTime() {
    return time;
  }

  /**
   * Sets the value of the 'time' field.
   * The time string, must not be null.
   * @param value the value to set.
   */
  public void setTime(CharSequence value) {
    this.time = value;
  }

  /**
   * Creates a new UserMoney RecordBuilder.
   * @return A new UserMoney RecordBuilder
   */
  public static com.serdar.bankbalance.avro.UserMoney.Builder newBuilder() {
    return new com.serdar.bankbalance.avro.UserMoney.Builder();
  }

  /**
   * Creates a new UserMoney RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new UserMoney RecordBuilder
   */
  public static com.serdar.bankbalance.avro.UserMoney.Builder newBuilder(com.serdar.bankbalance.avro.UserMoney.Builder other) {
    return new com.serdar.bankbalance.avro.UserMoney.Builder(other);
  }

  /**
   * Creates a new UserMoney RecordBuilder by copying an existing UserMoney instance.
   * @param other The existing instance to copy.
   * @return A new UserMoney RecordBuilder
   */
  public static com.serdar.bankbalance.avro.UserMoney.Builder newBuilder(com.serdar.bankbalance.avro.UserMoney other) {
    return new com.serdar.bankbalance.avro.UserMoney.Builder(other);
  }

  /**
   * RecordBuilder for UserMoney instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<UserMoney>
    implements org.apache.avro.data.RecordBuilder<UserMoney> {

    /** The key string, must not be null. */
    private CharSequence Name;
    /** The amount string, must not be null. */
    private CharSequence amount;
    /** The time string, must not be null. */
    private CharSequence time;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.serdar.bankbalance.avro.UserMoney.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.Name)) {
        this.Name = data().deepCopy(fields()[0].schema(), other.Name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.amount)) {
        this.amount = data().deepCopy(fields()[1].schema(), other.amount);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.time)) {
        this.time = data().deepCopy(fields()[2].schema(), other.time);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing UserMoney instance
     * @param other The existing instance to copy.
     */
    private Builder(com.serdar.bankbalance.avro.UserMoney other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.Name)) {
        this.Name = data().deepCopy(fields()[0].schema(), other.Name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.amount)) {
        this.amount = data().deepCopy(fields()[1].schema(), other.amount);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.time)) {
        this.time = data().deepCopy(fields()[2].schema(), other.time);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'Name' field.
      * The key string, must not be null.
      * @return The value.
      */
    public CharSequence getName() {
      return Name;
    }

    /**
      * Sets the value of the 'Name' field.
      * The key string, must not be null.
      * @param value The value of 'Name'.
      * @return This builder.
      */
    public com.serdar.bankbalance.avro.UserMoney.Builder setName(CharSequence value) {
      validate(fields()[0], value);
      this.Name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'Name' field has been set.
      * The key string, must not be null.
      * @return True if the 'Name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'Name' field.
      * The key string, must not be null.
      * @return This builder.
      */
    public com.serdar.bankbalance.avro.UserMoney.Builder clearName() {
      Name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'amount' field.
      * The amount string, must not be null.
      * @return The value.
      */
    public CharSequence getAmount() {
      return amount;
    }

    /**
      * Sets the value of the 'amount' field.
      * The amount string, must not be null.
      * @param value The value of 'amount'.
      * @return This builder.
      */
    public com.serdar.bankbalance.avro.UserMoney.Builder setAmount(CharSequence value) {
      validate(fields()[1], value);
      this.amount = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'amount' field has been set.
      * The amount string, must not be null.
      * @return True if the 'amount' field has been set, false otherwise.
      */
    public boolean hasAmount() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'amount' field.
      * The amount string, must not be null.
      * @return This builder.
      */
    public com.serdar.bankbalance.avro.UserMoney.Builder clearAmount() {
      amount = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'time' field.
      * The time string, must not be null.
      * @return The value.
      */
    public CharSequence getTime() {
      return time;
    }

    /**
      * Sets the value of the 'time' field.
      * The time string, must not be null.
      * @param value The value of 'time'.
      * @return This builder.
      */
    public com.serdar.bankbalance.avro.UserMoney.Builder setTime(CharSequence value) {
      validate(fields()[2], value);
      this.time = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'time' field has been set.
      * The time string, must not be null.
      * @return True if the 'time' field has been set, false otherwise.
      */
    public boolean hasTime() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'time' field.
      * The time string, must not be null.
      * @return This builder.
      */
    public com.serdar.bankbalance.avro.UserMoney.Builder clearTime() {
      time = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public UserMoney build() {
      try {
        UserMoney record = new UserMoney();
        record.Name = fieldSetFlags()[0] ? this.Name : (CharSequence) defaultValue(fields()[0]);
        record.amount = fieldSetFlags()[1] ? this.amount : (CharSequence) defaultValue(fields()[1]);
        record.time = fieldSetFlags()[2] ? this.time : (CharSequence) defaultValue(fields()[2]);
        return record;
      } catch (Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<UserMoney>
    WRITER$ = (org.apache.avro.io.DatumWriter<UserMoney>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<UserMoney>
    READER$ = (org.apache.avro.io.DatumReader<UserMoney>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
