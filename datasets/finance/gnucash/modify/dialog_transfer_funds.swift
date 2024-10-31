import SwiftUI
struct dialog_transfer_funds: View {
    @State private  var df5  : String?
    var body: some View {
        ZStack
        {
            ZStack
            {
                List
                {
                    HStack
                    {
                        Text("Amount")
                            .frame(minWidth:0,idealWidth:0)
                            .font(.system(size: 16))
                        Spacer()
                        Text("$ 2000.00")
                            .frame(minWidth:0,idealWidth:0)
                            .font(.system(size: 18))
                    }
                    .padding(10)
                    HStack
                    {
                        Text("From:")
                            .frame(minWidth:0,idealWidth:0)
                            .font(.system(size: 16))
                        Text("USD")
                            .frame(minWidth:0,idealWidth:0)
                            .bold()
                            .font(.system(size: 18))
                        Text("To:")
                            .frame(minWidth:0,idealWidth:0)
                            .font(.system(size: 16))
                        Text("EUR")
                            .frame(minWidth:0,idealWidth:0)
                            .bold()
                            .font(.system(size: 18))
                    }
                    .padding(10)
                    Text("Provide either the converted amount or exchange rate in order to transfer funds")
                        .frame(minWidth:0,maxWidth:.infinity)
                        .padding(10)
                    HStack
                    {
                        Button(action: { df5 = "" })
                        {
                            HStack
                            {
                                Image(systemName: df5 == "" ? "checkmark.circle.fill" : "circle")
                                Text("")
                                    .foregroundColor(.black)
                            }
                        }
                        .frame(minWidth:0,idealWidth:0)
                        HStack
                        {
                            TextField("Exchange rate", text: .constant(""))
                                .frame(minWidth:0,maxWidth:.infinity)
                        }
                        .frame(minWidth:0,idealWidth:0)
                        Button(action: {})
                        {
                            Text("Fetch quote")
                                .foregroundColor(.black)
                        }
                        .frame(minWidth:0,idealWidth:0)
                        .background(Color.white)
                    }
                    .padding(.top,10)
                    .padding(.leading,10)
                    .padding(.trailing,10)
                    Text("1 USD = 1.34 EUR")
                        .frame(minWidth:0,maxWidth:.infinity)
                        .padding(.bottom,10)
                        .padding(.leading,10)
                        .padding(.trailing,10)
                    HStack
                    {
                        Button(action: { df5 = "" })
                        {
                            HStack
                            {
                                Image(systemName: df5 == "" ? "checkmark.circle.fill" : "circle")
                                Text("")
                                    .foregroundColor(.black)
                            }
                        }
                        .frame(minWidth:0,idealWidth:0)
                        HStack
                        {
                            TextField("Converted Amount", text: .constant(""))
                            {
                         
                            }
                            .frame(minWidth:0,maxWidth:.infinity)
                        }
                        .frame(minWidth:0,idealWidth:0)
                        Text("EUR")
                            .font(.system(size: 16))
                    }
                    .padding(10)
                    VStack
                    {
                        Rectangle()
                            .frame(minWidth:0,maxWidth:.infinity,minHeight:0,idealHeight:0)
                        HStack
                        {
                            Button(action: {})
                            {
                                Text("Cancel")
                                    .foregroundColor(.yellow)
                            }
                            .frame(minWidth:0,idealWidth:0)
                            .background(Color.white)
                            Button(action: {})
                            {
                                Text("Save")
                                    .foregroundColor(.yellow)
                            }
                            .frame(minWidth:0,idealWidth:0)
                            .background(Color.white)
                        }
                        .frame(minWidth:0,maxWidth:.infinity)
                    }
                    .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
                    .padding(.top,5)
                }
                .frame(minWidth:0,maxWidth:.infinity)
            }
            .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
 
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct dialog_transfer_funds_Previews: PreviewProvider {
    static var previews: some View {
        dialog_transfer_funds()
    }
}
