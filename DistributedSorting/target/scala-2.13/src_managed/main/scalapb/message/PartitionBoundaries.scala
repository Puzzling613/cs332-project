// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package message

@SerialVersionUID(0L)
final case class PartitionBoundaries(
    startKey: _root_.scala.Predef.String = "",
    endKey: _root_.scala.Predef.String = "",
    unknownFields: _root_.scalapb.UnknownFieldSet = _root_.scalapb.UnknownFieldSet.empty
    ) extends scalapb.GeneratedMessage with scalapb.lenses.Updatable[PartitionBoundaries] {
    @transient
    private[this] var __serializedSizeMemoized: _root_.scala.Int = 0
    private[this] def __computeSerializedSize(): _root_.scala.Int = {
      var __size = 0
      
      {
        val __value = startKey
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(1, __value)
        }
      };
      
      {
        val __value = endKey
        if (!__value.isEmpty) {
          __size += _root_.com.google.protobuf.CodedOutputStream.computeStringSize(2, __value)
        }
      };
      __size += unknownFields.serializedSize
      __size
    }
    override def serializedSize: _root_.scala.Int = {
      var __size = __serializedSizeMemoized
      if (__size == 0) {
        __size = __computeSerializedSize() + 1
        __serializedSizeMemoized = __size
      }
      __size - 1
      
    }
    def writeTo(`_output__`: _root_.com.google.protobuf.CodedOutputStream): _root_.scala.Unit = {
      {
        val __v = startKey
        if (!__v.isEmpty) {
          _output__.writeString(1, __v)
        }
      };
      {
        val __v = endKey
        if (!__v.isEmpty) {
          _output__.writeString(2, __v)
        }
      };
      unknownFields.writeTo(_output__)
    }
    def withStartKey(__v: _root_.scala.Predef.String): PartitionBoundaries = copy(startKey = __v)
    def withEndKey(__v: _root_.scala.Predef.String): PartitionBoundaries = copy(endKey = __v)
    def withUnknownFields(__v: _root_.scalapb.UnknownFieldSet) = copy(unknownFields = __v)
    def discardUnknownFields = copy(unknownFields = _root_.scalapb.UnknownFieldSet.empty)
    def getFieldByNumber(__fieldNumber: _root_.scala.Int): _root_.scala.Any = {
      (__fieldNumber: @_root_.scala.unchecked) match {
        case 1 => {
          val __t = startKey
          if (__t != "") __t else null
        }
        case 2 => {
          val __t = endKey
          if (__t != "") __t else null
        }
      }
    }
    def getField(__field: _root_.scalapb.descriptors.FieldDescriptor): _root_.scalapb.descriptors.PValue = {
      _root_.scala.Predef.require(__field.containingMessage eq companion.scalaDescriptor)
      (__field.number: @_root_.scala.unchecked) match {
        case 1 => _root_.scalapb.descriptors.PString(startKey)
        case 2 => _root_.scalapb.descriptors.PString(endKey)
      }
    }
    def toProtoString: _root_.scala.Predef.String = _root_.scalapb.TextFormat.printToUnicodeString(this)
    def companion: message.PartitionBoundaries.type = message.PartitionBoundaries
    // @@protoc_insertion_point(GeneratedMessage[message.PartitionBoundaries])
}

object PartitionBoundaries extends scalapb.GeneratedMessageCompanion[message.PartitionBoundaries] {
  implicit def messageCompanion: scalapb.GeneratedMessageCompanion[message.PartitionBoundaries] = this
  def parseFrom(`_input__`: _root_.com.google.protobuf.CodedInputStream): message.PartitionBoundaries = {
    var __startKey: _root_.scala.Predef.String = ""
    var __endKey: _root_.scala.Predef.String = ""
    var `_unknownFields__`: _root_.scalapb.UnknownFieldSet.Builder = null
    var _done__ = false
    while (!_done__) {
      val _tag__ = _input__.readTag()
      _tag__ match {
        case 0 => _done__ = true
        case 10 =>
          __startKey = _input__.readStringRequireUtf8()
        case 18 =>
          __endKey = _input__.readStringRequireUtf8()
        case tag =>
          if (_unknownFields__ == null) {
            _unknownFields__ = new _root_.scalapb.UnknownFieldSet.Builder()
          }
          _unknownFields__.parseField(tag, _input__)
      }
    }
    message.PartitionBoundaries(
        startKey = __startKey,
        endKey = __endKey,
        unknownFields = if (_unknownFields__ == null) _root_.scalapb.UnknownFieldSet.empty else _unknownFields__.result()
    )
  }
  implicit def messageReads: _root_.scalapb.descriptors.Reads[message.PartitionBoundaries] = _root_.scalapb.descriptors.Reads{
    case _root_.scalapb.descriptors.PMessage(__fieldsMap) =>
      _root_.scala.Predef.require(__fieldsMap.keys.forall(_.containingMessage eq scalaDescriptor), "FieldDescriptor does not match message type.")
      message.PartitionBoundaries(
        startKey = __fieldsMap.get(scalaDescriptor.findFieldByNumber(1).get).map(_.as[_root_.scala.Predef.String]).getOrElse(""),
        endKey = __fieldsMap.get(scalaDescriptor.findFieldByNumber(2).get).map(_.as[_root_.scala.Predef.String]).getOrElse("")
      )
    case _ => throw new RuntimeException("Expected PMessage")
  }
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.Descriptor = MessageProto.javaDescriptor.getMessageTypes().get(12)
  def scalaDescriptor: _root_.scalapb.descriptors.Descriptor = MessageProto.scalaDescriptor.messages(12)
  def messageCompanionForFieldNumber(__number: _root_.scala.Int): _root_.scalapb.GeneratedMessageCompanion[_] = throw new MatchError(__number)
  lazy val nestedMessagesCompanions: Seq[_root_.scalapb.GeneratedMessageCompanion[_ <: _root_.scalapb.GeneratedMessage]] = Seq.empty
  def enumCompanionForFieldNumber(__fieldNumber: _root_.scala.Int): _root_.scalapb.GeneratedEnumCompanion[_] = throw new MatchError(__fieldNumber)
  lazy val defaultInstance = message.PartitionBoundaries(
    startKey = "",
    endKey = ""
  )
  implicit class PartitionBoundariesLens[UpperPB](_l: _root_.scalapb.lenses.Lens[UpperPB, message.PartitionBoundaries]) extends _root_.scalapb.lenses.ObjectLens[UpperPB, message.PartitionBoundaries](_l) {
    def startKey: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.startKey)((c_, f_) => c_.copy(startKey = f_))
    def endKey: _root_.scalapb.lenses.Lens[UpperPB, _root_.scala.Predef.String] = field(_.endKey)((c_, f_) => c_.copy(endKey = f_))
  }
  final val STARTKEY_FIELD_NUMBER = 1
  final val ENDKEY_FIELD_NUMBER = 2
  def of(
    startKey: _root_.scala.Predef.String,
    endKey: _root_.scala.Predef.String
  ): _root_.message.PartitionBoundaries = _root_.message.PartitionBoundaries(
    startKey,
    endKey
  )
  // @@protoc_insertion_point(GeneratedMessageCompanion[message.PartitionBoundaries])
}
