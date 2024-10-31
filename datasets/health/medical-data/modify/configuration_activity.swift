import SwiftUI
struct configuration_activity: View {
    @State private  var checkbox_id  = false
    @State private  var checkBox_Location_Id  = false
    var body: some View {
        ScrollView
        {
            ZStack
            {
                ZStack
                {
                    VStack
                    {
                        Text("CONFIGURATION")
                            .padding(.top,17)
                            .padding(.bottom,5)
                            .padding(.leading,5)
                            .padding(.leading,5)
                            .foregroundColor(Color(red:0.019607844,green:0.019607844,blue:0.019607844,opacity:1.0))
                        VStack
                        {
                            Rectangle()
                                .fill(Color(red:0.7529412,green:0.7529412,blue:0.7529412,opacity:1.0))
                                .frame(minHeight:2,idealHeight:2)
                            Text("Allow to use mobile data to send information.")
                                .padding(.top,35)
                        }
                    }
                    Button(action: { self.checkbox_id.toggle() })
                    {
                        HStack
                        {
                            Image(systemName: checkbox_id ? "checkmark.square" : "square")
                            Text("null")
                                .foregroundColor(.black)
                        }
                    }
                    .background(Color.blue)
                    
                    Text("Allow to collect information about location.")
                        .padding(.top,10)
                    Button(action: { self.checkBox_Location_Id.toggle() })
                    {
                        HStack
                        {
                            Image(systemName: checkBox_Location_Id ? "checkmark.square" : "square")
                            Text("null")
                                .foregroundColor(.black)
                        }
                    }
                    .background(Color.white)
                 
                }
                .padding(.top,16)
                .padding(.bottom,16)
                .padding(.leading,16)
                .padding(.trailing,16)
            }
        }}}

struct configuration_activity_Previews: PreviewProvider {
    static var previews: some View {
        configuration_activity()
    }
}
