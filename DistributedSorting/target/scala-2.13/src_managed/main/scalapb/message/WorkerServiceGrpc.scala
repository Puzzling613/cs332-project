// Generated by the Scala Plugin for the Protocol Buffer Compiler.
// Do not edit!
//
// Protofile syntax: PROTO3

package message


object WorkerServiceGrpc {
  val METHOD_START_SHUFFLE: _root_.io.grpc.MethodDescriptor[message.ShuffleRequest, message.ShuffleReply] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("message.WorkerService", "StartShuffle"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[message.ShuffleRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[message.ShuffleReply])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(message.MessageProto.javaDescriptor.getServices().get(1).getMethods().get(0)))
      .build()
  
  val METHOD_START_SORT: _root_.io.grpc.MethodDescriptor[message.SortRequest, message.SortReply] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("message.WorkerService", "StartSort"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[message.SortRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[message.SortReply])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(message.MessageProto.javaDescriptor.getServices().get(1).getMethods().get(1)))
      .build()
  
  val METHOD_SEND_PARTITION_DATA: _root_.io.grpc.MethodDescriptor[message.PartitionDataRequest, message.PartitionDataReply] =
    _root_.io.grpc.MethodDescriptor.newBuilder()
      .setType(_root_.io.grpc.MethodDescriptor.MethodType.UNARY)
      .setFullMethodName(_root_.io.grpc.MethodDescriptor.generateFullMethodName("message.WorkerService", "SendPartitionData"))
      .setSampledToLocalTracing(true)
      .setRequestMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[message.PartitionDataRequest])
      .setResponseMarshaller(_root_.scalapb.grpc.Marshaller.forMessage[message.PartitionDataReply])
      .setSchemaDescriptor(_root_.scalapb.grpc.ConcreteProtoMethodDescriptorSupplier.fromMethodDescriptor(message.MessageProto.javaDescriptor.getServices().get(1).getMethods().get(2)))
      .build()
  
  val SERVICE: _root_.io.grpc.ServiceDescriptor =
    _root_.io.grpc.ServiceDescriptor.newBuilder("message.WorkerService")
      .setSchemaDescriptor(new _root_.scalapb.grpc.ConcreteProtoFileDescriptorSupplier(message.MessageProto.javaDescriptor))
      .addMethod(METHOD_START_SHUFFLE)
      .addMethod(METHOD_START_SORT)
      .addMethod(METHOD_SEND_PARTITION_DATA)
      .build()
  
  trait WorkerService extends _root_.scalapb.grpc.AbstractService {
    override def serviceCompanion = WorkerService
    def startShuffle(request: message.ShuffleRequest): scala.concurrent.Future[message.ShuffleReply]
    def startSort(request: message.SortRequest): scala.concurrent.Future[message.SortReply]
    def sendPartitionData(request: message.PartitionDataRequest): scala.concurrent.Future[message.PartitionDataReply]
  }
  
  object WorkerService extends _root_.scalapb.grpc.ServiceCompanion[WorkerService] {
    implicit def serviceCompanion: _root_.scalapb.grpc.ServiceCompanion[WorkerService] = this
    def javaDescriptor: _root_.com.google.protobuf.Descriptors.ServiceDescriptor = message.MessageProto.javaDescriptor.getServices().get(1)
    def scalaDescriptor: _root_.scalapb.descriptors.ServiceDescriptor = message.MessageProto.scalaDescriptor.services(1)
    def bindService(serviceImpl: WorkerService, executionContext: scala.concurrent.ExecutionContext): _root_.io.grpc.ServerServiceDefinition =
      _root_.io.grpc.ServerServiceDefinition.builder(SERVICE)
      .addMethod(
        METHOD_START_SHUFFLE,
        _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[message.ShuffleRequest, message.ShuffleReply] {
          override def invoke(request: message.ShuffleRequest, observer: _root_.io.grpc.stub.StreamObserver[message.ShuffleReply]): _root_.scala.Unit =
            serviceImpl.startShuffle(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
              executionContext)
        }))
      .addMethod(
        METHOD_START_SORT,
        _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[message.SortRequest, message.SortReply] {
          override def invoke(request: message.SortRequest, observer: _root_.io.grpc.stub.StreamObserver[message.SortReply]): _root_.scala.Unit =
            serviceImpl.startSort(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
              executionContext)
        }))
      .addMethod(
        METHOD_SEND_PARTITION_DATA,
        _root_.io.grpc.stub.ServerCalls.asyncUnaryCall(new _root_.io.grpc.stub.ServerCalls.UnaryMethod[message.PartitionDataRequest, message.PartitionDataReply] {
          override def invoke(request: message.PartitionDataRequest, observer: _root_.io.grpc.stub.StreamObserver[message.PartitionDataReply]): _root_.scala.Unit =
            serviceImpl.sendPartitionData(request).onComplete(scalapb.grpc.Grpc.completeObserver(observer))(
              executionContext)
        }))
      .build()
  }
  
  trait WorkerServiceBlockingClient {
    def serviceCompanion = WorkerService
    def startShuffle(request: message.ShuffleRequest): message.ShuffleReply
    def startSort(request: message.SortRequest): message.SortReply
    def sendPartitionData(request: message.PartitionDataRequest): message.PartitionDataReply
  }
  
  class WorkerServiceBlockingStub(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions = _root_.io.grpc.CallOptions.DEFAULT) extends _root_.io.grpc.stub.AbstractStub[WorkerServiceBlockingStub](channel, options) with WorkerServiceBlockingClient {
    override def startShuffle(request: message.ShuffleRequest): message.ShuffleReply = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_START_SHUFFLE, options, request)
    }
    
    override def startSort(request: message.SortRequest): message.SortReply = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_START_SORT, options, request)
    }
    
    override def sendPartitionData(request: message.PartitionDataRequest): message.PartitionDataReply = {
      _root_.scalapb.grpc.ClientCalls.blockingUnaryCall(channel, METHOD_SEND_PARTITION_DATA, options, request)
    }
    
    override def build(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions): WorkerServiceBlockingStub = new WorkerServiceBlockingStub(channel, options)
  }
  
  class WorkerServiceStub(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions = _root_.io.grpc.CallOptions.DEFAULT) extends _root_.io.grpc.stub.AbstractStub[WorkerServiceStub](channel, options) with WorkerService {
    override def startShuffle(request: message.ShuffleRequest): scala.concurrent.Future[message.ShuffleReply] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_START_SHUFFLE, options, request)
    }
    
    override def startSort(request: message.SortRequest): scala.concurrent.Future[message.SortReply] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_START_SORT, options, request)
    }
    
    override def sendPartitionData(request: message.PartitionDataRequest): scala.concurrent.Future[message.PartitionDataReply] = {
      _root_.scalapb.grpc.ClientCalls.asyncUnaryCall(channel, METHOD_SEND_PARTITION_DATA, options, request)
    }
    
    override def build(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions): WorkerServiceStub = new WorkerServiceStub(channel, options)
  }
  
  object WorkerServiceStub extends _root_.io.grpc.stub.AbstractStub.StubFactory[WorkerServiceStub] {
    override def newStub(channel: _root_.io.grpc.Channel, options: _root_.io.grpc.CallOptions): WorkerServiceStub = new WorkerServiceStub(channel, options)
    
    implicit val stubFactory: _root_.io.grpc.stub.AbstractStub.StubFactory[WorkerServiceStub] = this
  }
  
  def bindService(serviceImpl: WorkerService, executionContext: scala.concurrent.ExecutionContext): _root_.io.grpc.ServerServiceDefinition = WorkerService.bindService(serviceImpl, executionContext)
  
  def blockingStub(channel: _root_.io.grpc.Channel): WorkerServiceBlockingStub = new WorkerServiceBlockingStub(channel)
  
  def stub(channel: _root_.io.grpc.Channel): WorkerServiceStub = new WorkerServiceStub(channel)
  
  def javaDescriptor: _root_.com.google.protobuf.Descriptors.ServiceDescriptor = message.MessageProto.javaDescriptor.getServices().get(1)
  
}